//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(a[i]);
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.nextPermutation(N, arr);
            StringBuilder out = new StringBuilder();
            for(int i = 0;i < N;i++)
                out.append(ans.get(i) + " ");
            System.out.println(out);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static List<Integer> nextPermutation(int N, int nums[]){
        // code here
        int ind1=-1, ind2=-1;
        for(int i=nums.length-2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                ind1 =i;
                break;
            }
        }if(ind1==-1){
            reverse(nums, 0);
        }else{
            for(int i=nums.length-1; i>=0; i--){
                if(nums[i]>nums[ind1]){
                    ind2 =i;
                    break;
                }
            }
            swap(nums, ind1, ind2);
            reverse(nums, ind1+1);
        }
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<N; i++){
            list.add(nums[i]);
        }
        return list;
    }
    static void swap(int nums[], int start, int end){
        int temp= nums[start];
        nums[start] = nums[end];
        nums[end]= temp;
    }
    static void reverse(int nums[], int start){
        int i= start , j=nums.length-1;
        while(i<=j){
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}
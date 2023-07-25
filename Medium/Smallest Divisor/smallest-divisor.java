//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- > 0) {

            int n = sc.nextInt();
            int K;
            K = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) nums[i] = sc.nextInt();

            Solution obj = new Solution();
            int res = obj.smallestDivisor(nums, K);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int f(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            max = Math.max(max, arr[i]);
        }
        return max;
    }
    public static int f(int arr[], int hour){
        int ans =0;
        for(int i=0; i<arr.length; i++){
            ans+=Math.ceil((double)arr[i]/(double)hour);
        }
        return ans;
    }
    public static int smallestDivisor(int[] nums, int K) {
           int low =1, high = f(nums);
           while(low<=high){
               int mid = (low+high)/2;
               int ans = f(nums, mid);
               if(ans<=K){
                   high =mid-1;
               }else{
                   low = mid+1;
               }
           }
           return low;
        
    }
}
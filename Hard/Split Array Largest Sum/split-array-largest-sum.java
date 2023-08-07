//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String St[] = read.readLine().split(" ");
            
            int N = Integer.parseInt(St[0]);
            int K = Integer.parseInt(St[1]);
            
            String S[] = read.readLine().split(" ");
            
            int[] arr = new int[N];
            
            for(int i=0 ; i<N ; i++)
                arr[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            System.out.println(ob.splitArray(arr,N,K));
        }
    }
}
// } Driver Code Ends


class Solution {
    public static int f(int arr[], int k){
        int count =1;
        long ans =0;
        for(int i=0; i<arr.length; i++){
            if(ans+arr[i]<=k){
                ans+=arr[i];
            }else{
                count++;
                ans= arr[i];
            }
        }
        return count;
    }
    static int splitArray(int[] arr , int N, int k) {
        // code here
        int low =0, high=0;
        for(int i=0; i<arr.length; i++){
            low = Math.max(low, arr[i]);
            high +=arr[i];
        }
        while(low<=high){
            int mid = (low+high)/2;
            int ans = f(arr, mid);
            if(ans<=k){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
};

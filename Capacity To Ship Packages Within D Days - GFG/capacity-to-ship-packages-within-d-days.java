//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S[] = read.readLine().split(" ");
            int[] arr = new int[N];
            
            int D = Integer.parseInt(read.readLine());
            
            for(int i=0; i<N; i++)
                arr[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            System.out.println(ob.leastWeightCapacity(arr,N,D));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    public static boolean solve(int arr[], int max, int d){
        int weight =0, day=1;
        for(int i=0; i<arr.length; i++){
            if(weight+arr[i]>max){
                day++;
                weight = arr[i];
            }else
            weight+=arr[i];
        }
        return day<=d;
    }
    static int leastWeightCapacity(int[] arr, int N, int D) {
        // code here
        int max =0; int sum =0;
        for(int i=0; i<arr.length; i++){
            max = Math.max(arr[i], max);
                sum+=arr[i];
            }
            int lo = max;int ans =-1;
            int hi =  sum;
            if(D==arr.length)return max;
            while(lo<=hi){
                int mid = lo+(hi-lo)/2;
                if(solve(arr, mid, D)){
                    ans = mid;
                    hi = mid-1;
                }
                else
                lo = mid+1;
            
        }return ans;
       
    }
};
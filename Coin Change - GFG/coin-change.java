//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int sum = sc.nextInt();
            int N = sc.nextInt();
            int coins[] = new int[N];
            for (int i = 0; i < N; i++) coins[i] = sc.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.count(coins, N, sum));
        }
    }
}


// } Driver Code Ends


// User function Template for Java

class Solution {
    static long f(int []arr,int ind, int T, long[][]dp){
        if(ind==0){
            if(T%arr[0]==0)return 1; 
            else return 0;
        }
        if(dp[ind][T]!=-1)return dp[ind][T];
       long nottake = f(arr, ind-1, T, dp);
       long take = 0;
       if(arr[ind]<=T){
           take = f(arr, ind, T-arr[ind], dp);
       }
       return dp[ind][T]= take+nottake;
    }
    public long count(int coins[], int N, int sum) {
        // code here.
        long dp[][] = new long[coins.length][sum+1];
        for(long row[]: dp){
            Arrays.fill(row, -1);
        }
        long ans = f(coins, N-1, sum , dp);
       return ans;
        
    }
}
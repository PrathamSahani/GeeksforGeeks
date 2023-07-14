//{ Driver Code Starts
import java.io.*;
import java.util.*;

class RodCutting {

    public static void main(String args[])throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        
        int t = Integer.parseInt(in.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(in.readLine().trim());
            String s[]=in.readLine().trim().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(s[i]);

            Solution ob = new Solution();
            out.println(ob.cutRod(arr, n));
        }
        out.close();
    }
}

// } Driver Code Ends


class Solution{
    public static int f(int arr[], int ind, int n, int [][]dp){
        // int n = arr.length;
        if(ind==0)return n*arr[0];
        if(dp[ind][n]!=-1)return dp[ind][n];
        int notake = 0+ f(arr, ind-1,n,  dp);
        int take =Integer.MIN_VALUE;
        int rod = ind+1;
        if(rod<=n){
            take = arr[ind]+f(arr, ind,n-rod,   dp);
        }
        return dp[ind][n] = Math.max(notake, take);
    }
    public int cutRod(int price[], int n) {
        //code here
        int dp[][] = new int[n][n+1];
        for(int row[]: dp){
            Arrays.fill(row, -1);
        }
        return f(price, n-1,n,  dp);
    }
}
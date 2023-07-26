//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            int sum = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            if(ob.isSubsetSum(N, arr, sum))
            System.out.println(1);
            else
            System.out.println(0);

            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    public static boolean f(int ind, int target, int arr[], int dp[][]){
        if(target==0)return true;
        if(ind<0 || target<0)return false;
        if(dp[ind][target]!=-1)return dp[ind][target]==target;
        boolean result = f(ind-1, target, arr, dp) || f(ind-1, target-arr[ind], arr, dp);
        dp[ind][target] = result?1:0;
        return result;
    }
    static Boolean isSubsetSum(int n, int arr[], int k){
        // code here
        int dp[][] = new int[n][k+1];
        for(int row[]: dp){
            Arrays.fill(row, -1);
        }
        return f(n-1, k, arr, dp);
    }
}
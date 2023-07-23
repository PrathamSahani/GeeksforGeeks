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
    
   static int f(int i, int[] arr, int sum, int[][] dp) {
        if (sum == 0) return 1;
        if (i == 0) return (arr[0] == sum) ? 1 : 0;
        if (dp[i][sum] != -1) return dp[i][sum];

        int ntake = f(i - 1, arr, sum, dp);
        int take = 0;
        if (sum >= arr[i]) {
            take = f(i - 1, arr, sum - arr[i], dp);
        }
        return dp[i][sum] = (ntake | take); // Use | instead of || for int values (1 for true, 0 for false)
    }
    static Boolean isSubsetSum(int n, int arr[], int sum){
        // code here
        // int n = arr.length;
        int[][] dp = new int[n][sum + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return f(n - 1, arr, sum, dp) == 1; 
    }
}
//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().findMaxSum(arr, n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    public static int f(int ind, int arr[], int dp[]){
        if(ind<0)return 0;
        if(ind==0)return arr[ind];
        if(dp[ind]!=-1)return dp[ind];
        int pick = arr[ind]+f(ind-2, arr, dp);
        int np = 0+ f(ind-1, arr, dp);
        return dp[ind] = Math.max(pick, np);
    }
    int findMaxSum(int arr[], int n) {
        // code here
        int dp[] = new int[n];
        Arrays.fill(dp, -1);
        return f(arr.length-1, arr, dp);
    }
}
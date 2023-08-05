//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])throws IOException
    {
        //reading input using BufferedReader class
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        //reading total testcases
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            //reading number of elements and weight
            int n = Integer.parseInt(read.readLine());
            int w = Integer.parseInt(read.readLine());
            
            int val[] = new int[n];
            int wt[] = new int[n];
            
            String st[] = read.readLine().trim().split("\\s+");
            
            //inserting the values
            for(int i = 0; i < n; i++)
              val[i] = Integer.parseInt(st[i]);
             
            String s[] = read.readLine().trim().split("\\s+"); 
            
            //inserting the weigths
            for(int i = 0; i < n; i++)
              wt[i] = Integer.parseInt(s[i]);
              
            //calling method knapSack() of class Knapsack
            System.out.println(new Solution().knapSack(w, wt, val, n));
        }
    }
}




// } Driver Code Ends


class Solution 
{ 
  static int f(int[]wt , int []val, int ind, int W, int[][]dp){
      if(ind==0){
          if(wt[0]<=W)return val[0];
          else
          return 0;
      }
      if(dp[ind][W]!=-1)return dp[ind][W];
      int nt = 0+f(wt, val, ind-1, W, dp);
      int t = Integer.MIN_VALUE;
      if(wt[ind]<=W){
          t = val[ind]+f(wt, val, ind-1, W-wt[ind], dp);
          
      }
      return dp[ind][W] = Math.max(nt, t);
  }
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
         // your code here 
         int dp[][] = new int[n][W+1];
         for(int row[]: dp){
             Arrays.fill(row, -1);
         }
         return f(wt, val, n-1, W, dp);
    } 
}



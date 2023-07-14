//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Solution obj = new Solution();
                    System.out.println(obj.longestPalinSubseq(s));
                }
                
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int longestPalinSubseq(String S)
    {
        //code here
       String p = new StringBuilder(S).reverse().toString();
       int m = S.length();
       int dp1[] = new int[m+1];
       int dp2[] = new int[m+1];
       for(int i=1; i<=m; i++){
           for(int j=1; j<=m; j++){
               if(S.charAt(i-1)==p.charAt(j-1)){
                   dp1[j] = dp2[j-1]+1;
               }else{
                   dp1[j] = Math.max(dp1[j-1], dp2[j]);
               }
           }
           for(int j=1; j<=m; j++){
               dp2[j] = dp1[j];
           }
       }
       return dp1[m];
    }
}
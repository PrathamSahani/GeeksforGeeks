//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String read[] = in.readLine().trim().split("\\s+");
            int n = Integer.parseInt(read[0]);
            int r = Integer.parseInt(read[1]);
            
            Solution ob = new Solution();
            System.out.println(ob.nCr(n, r));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static int nCr(int n, int r)
    {   
        if(r>n)
            return 0;
        if(n==r || r==0)
            return 1;
        if(r==1)
            return n;
        int mod=(int)(Math.pow(10,9)+7);
        int[][] ans = new int[r][n];
        for(int i = 0; i<n; i++)
            ans[0][i] = i+1;
        
        for(int i = 1; i<r; i++){
            for(int j = 1; j<n; j++){
                if(i>j)
                    ans[i][j] = 0;
                else if(i == j)
                    ans[i][j] = 1;
                else
                    ans[i][j] = (ans[i][j-1] + ans[i-1][j-1])%mod;
            }
        }
        
        return ans[r-1][n-1]%mod;
    }
  
}
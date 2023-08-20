//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] matrix = new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++)
                    matrix[i][j] = Integer.parseInt(S[j]);
            }
            Solution ob = new Solution();
            int ans = ob.Count(matrix);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends




//User function Template for Java

class Solution
{
    public int  Count(int[][] matrix)
    {
        int m=matrix.length;
        int n=matrix[0].length;
        int[] rows={-1,0,1,0};
        int[] cols={0,1,0,-1};
        
        if(m==1&&n==1){
            return 0;
        }
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==1){
                   if(bfs(i,j,matrix)==true){
                       count++;
                   } 
                }
            }
        }
        return count;
    }
    
 boolean bfs(int r,int c,int[][] matrix){
     int count=0;
     for(int i=-1;i<=1;i++){
          int newr=r+i;
         for(int j=-1;j<=1;j++){
            
             int newc=c+j;
             if(newr>=0&&newc>=0&&newr<matrix.length&&newc<matrix[0].length){
                
                     if(matrix[newr][newc]==0){
                        count++; 
                     }
                
             }
         }
     }
     if(count>0&&count%2==0){
         return true;
     }return false;
 }
}












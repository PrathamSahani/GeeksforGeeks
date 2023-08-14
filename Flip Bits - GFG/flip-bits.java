//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.maxOnes(a, n));
            
        }
	}
}
// } Driver Code Ends



class Solution {
    public static int maxOnes(int a[], int n) {
        int totalones=0;
        int currsum=0;
        int maxsum=0;
     for( int i=0; i<n;i++){
         if(a[i]==1)
         totalones++;
         int val= a[i]==1?-1:1;
         currsum+=val;
         if(currsum>maxsum){
             maxsum=currsum;
         }
         if(currsum<0){
             currsum=0;
         }
     }
     return totalones+maxsum;
    }
}
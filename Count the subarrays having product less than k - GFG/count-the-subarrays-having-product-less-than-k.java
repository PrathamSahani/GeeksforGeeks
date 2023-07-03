//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


class GFG {
	public static void main(String[] args) throws IOException
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            int n = Integer.parseInt(stt.nextToken());
            long k = Long.parseLong(stt.nextToken());
            
            long a[] = new long[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.countSubArrayProductLessThanK(a, n, k));
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Solution {
    public static int Fun(long arr[], int low, int n , long k){
        long p=1;
        int count =0;
        for(int i=low; i<=n; i++){
            p=p*arr[i];
            if(p<k){
                count++;
            }else{
                return count;
            }
        }
        return count;
    }
    
    public int countSubArrayProductLessThanK(long a[], int n, long k)
    {
        int res=0;
        for(int i=0; i<n; i++){
            res+=Fun(a, i, n-1, k);
        }
        return res;
      
    }
}
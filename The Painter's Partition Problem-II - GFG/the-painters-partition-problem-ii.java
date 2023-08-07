//{ Driver Code Starts
//Initial Template for Java

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
            String input_line1[] = read.readLine().trim().split("\\s+");
            int k = Integer.parseInt(input_line1[0]);
            int n = Integer.parseInt(input_line1[1]);
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[n];
            for(int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.minTime(arr,n,k));
        }
    }
}


// } Driver Code Ends


//User function Template for Java

 class Solution{
     public static int f(int arr[], int n, long k){
         int count=1;
         long ans =0;
         for(int i=0; i<n; i++){
             if(ans+arr[i]<=k){
                 ans+=arr[i];
             }else{
                 count++;
                 ans = arr[i];
             }
         }
         return count;
     }
    static long minTime(int[] arr,int n,int k){
        //code here
        int max =Integer.MIN_VALUE;
        long high = 0;
        for(int i=0; i<n; i++){
            max = Math.max(max, arr[i]);
            high+=arr[i];
        }
        long low = max;
        while(low<=high){
            long mid = low+(high-low)/2;
            int ans = f(arr, n ,mid);
            if(ans<=k){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
}



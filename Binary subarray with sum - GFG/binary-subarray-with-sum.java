//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      int n = sc.nextInt();
      int target = sc.nextInt();
      int a[] = new int[n];
      for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
      }
      
      Solution obj = new Solution();
      int ans = obj.numberOfSubarrays(a, n, target);
      System.out.println(ans);
    }
  }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    int numberOfSubarrays(int arr[], int N, int target){
        // code here
        return f(arr, target)-f(arr, target-1);
    }
    
     public int f(int arr[], int target){
         int j=0, sum=0;int cnt =0;
         for(int i=0; i<arr.length; i++){
             sum+=arr[i];
             while(sum>target){
                 sum-=arr[j++];
             }
             cnt+=i-j+1;
         }
         return cnt;
     }
}
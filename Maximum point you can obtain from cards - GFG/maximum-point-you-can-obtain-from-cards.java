//{ Driver Code Starts
// Initial Template for Java

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
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Solution obj = new Solution();
            long ans = obj.maxScore(a, n, k);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static long maxScore(int arr[], int N, int k) {
        // code here
           // code here

        int n=arr.length;
        long curr=0;
        for(int i=0;i<k;i++){
            curr+=arr[i];
        }
        long ans=curr;
        for(int i=k-1;i>=0;i--){
            curr-=arr[i];
            curr+=arr[n-k+i];
            ans=Math.max(ans,curr);
        }
        return ans;
    }
}

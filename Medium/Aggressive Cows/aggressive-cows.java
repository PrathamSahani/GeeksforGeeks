//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- > 0) {

            int n;
            n = sc.nextInt();

            int k;
            k = sc.nextInt();

            int[] v = new int[n];
            for (int i = 0; i < n; i++) v[i] = sc.nextInt();

            Solution obj = new Solution();
            int res = obj.solve(n, k, v);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public static boolean isPossible(int[] arr , int mid, int k){
        int dist = arr[0];
        int count =1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]-dist>=mid){
                count++;
                dist = arr[i];
            }    
        }
        if(count<k){
            return false;
        }return true;
    }
    public static int solve(int n, int k, int[] stalls) {
        Arrays.sort(stalls);
        int min =1 ;
        int max =0;
        for(int i=0; i<stalls.length; i++){
            max = Math.max(max, stalls[i]);
        }
        int low = min;
        int high = max;
        int ans = 0;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(isPossible(stalls, mid, k)==true){
                ans = mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
        
    }
}
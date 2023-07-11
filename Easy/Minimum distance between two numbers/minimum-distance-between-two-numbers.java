//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) 
                a[i] = Integer.parseInt(str[i]);
            String[] xy = br.readLine().trim().split(" ");
            int x = Integer.parseInt(xy[0]);
            int y = Integer.parseInt(xy[1]);
            Solution g = new Solution();
            System.out.println(g.minDist(a, n, x, y));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int minDist(int a[], int n, int x, int y) {
        // code here
      int dist =Integer.MAX_VALUE;
      int start =-1;
      int end =-1;
      for(int i=0; i<a.length; i++){
          if(a[i]==x){
              start =i;
          }
          if(a[i]==y){
              end = i;
          }
          if(start!=-1 && end!= -1){
              dist = Math.min(Math.abs(end-start), dist);
          }
      }
      if(dist!=Integer.MAX_VALUE)return dist;
      return -1;
    }
}
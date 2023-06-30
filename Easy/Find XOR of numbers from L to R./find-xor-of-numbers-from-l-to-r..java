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

            int l;
            l = sc.nextInt();

            int r;
            r = sc.nextInt();

            Solution obj = new Solution();
            int res = obj.findXOR(l, r);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
   static int func(int x){
        if(x%4==0)return x;
        if(x%4==1)return 1;
        if(x%4==2)return x+1;
        if(x%4==3)return 0;
        return -1;
    }
    public static int findXOR(int l, int r) {
         return func(l-1)^func(r);
        
    }
}
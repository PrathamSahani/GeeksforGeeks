//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            Long N = Long.parseLong(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.getSmallest(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static String getSmallest(Long N) {
        // code here
         if (N == 1) {
            return "1"; // Special case for N = 1
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 9; i >= 2; i--) {
            while (N % i == 0) {
                sb.append(i);
                N /= i;
            }
        }
        
        if (N > 1) {
            return "-1"; // No such number
        }
        return sb.reverse().toString();
    }
};
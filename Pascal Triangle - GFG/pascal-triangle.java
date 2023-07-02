//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());

            ArrayList<Long> ans = new Solution().nthRowOfPascalTriangle(n);
            printAns(ans);
        }
    }
    public static void printAns(ArrayList<Long> ans) {
        for (Long x : ans) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    ArrayList<Long> nthRowOfPascalTriangle(int n) {
        // code here
        ArrayList<Long> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            ArrayList<Long> col = new ArrayList<>();
            for(int j=0; j<=i; j++){
                if(j==i || j==0){
                col.add((long)1);
                }else{
               col.add((ans.get(j-1)+ans.get(j))%1000000007);
                }
            }
            ans = col;
        }
        return ans;
    }
}
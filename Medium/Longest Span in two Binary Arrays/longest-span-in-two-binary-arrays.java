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

            boolean arr1[] = new boolean[n];
            boolean arr2[] = new boolean[n];
            String[] str = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr1[i] = str[i].equals("1") ? true : false;
            }
            str = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr2[i] = str[i].equals("1") ? true : false;
            }

            int ans = new Solution().longestCommonSum(arr1, arr2, n);

            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int longestCommonSum(boolean arr1[], boolean arr2[], int n) {
        // code here
         int res1[] =new int[n];
         int res2[]= new int[n];
         int maxLen =0;
         HashMap<Integer, Integer> map = new HashMap<>();
         for(int i=0, sum1=0, sum2=0; i<n; i++){
             sum1+=arr1[i]?1:-1;
             sum2+=arr2[i]?1:-1;
             
             res1[i] = sum1;
             res2[i] = sum2;
             int diff = res1[i] - res2[i];
            if (diff == 0) {
                maxLen = i + 1;
            } else if (!map.containsKey(diff)) {
                map.put(diff, i);
            } else {
                maxLen = Math.max(maxLen, i - map.get(diff));
            }
         }
         return maxLen;
    
    }
}
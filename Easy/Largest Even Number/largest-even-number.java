//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[]) throws IOException{
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());
        while(t-- > 0){
            String s = read.readLine().trim();
            Solution ob = new Solution();
            String answer = ob.LargestEven(s);
            System.out.println(answer);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    public String LargestEven(String S){
         List<Integer> v = new ArrayList<>();
        for (int i = 0; i < S.length(); i++) {
            v.add((int) S.charAt(i));
        }
        Collections.sort(v);
        Collections.reverse(v);
        for (int i = S.length() - 1; i >= 0; i--) {
            if (v.get(i) % 2 == 0) {
                while (i != S.length() - 1) {
                    Collections.swap(v, i, i + 1);
                    i++;
                }
                break;
            }
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            res.append((char) (int) v.get(i));
        }
        return res.toString();
    }
}
//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String a[] = in.readLine().trim().split("\\s+");
            int N = Integer.parseInt(a[0]);
            int S = Integer.parseInt(a[1]);
            
            Solution ob = new Solution();
            System.out.println(ob.findLargest(N, S));
        }
    }
}
// } Driver Code Ends

class Solution{
    static String findLargest(int N, int S){
        // code here
       int sum=0;
        String digit = "";
        if( (S == 0 && N>1) || S > N*9 ) return "-1";
        for(int i=0;i<N;i++){
            if(S <= 9) {
                digit += S;
                S=0;
            }
            else {
                digit += 9;
                S -= 9;
            }
        }
        if(S > sum) return "-1";
        return digit;
    }
}
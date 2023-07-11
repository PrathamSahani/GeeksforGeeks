//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {   
            String s = read.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.isdivisible7(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    int isdivisible7(String num){
        // code here
        int rem =0;
        for(int i=0;i<num.length(); i++){
            rem = ((rem*10)+(num.charAt(i)-'0'))%7;
        }
        return rem==0?1:0;
    }
}
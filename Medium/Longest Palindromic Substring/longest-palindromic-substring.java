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
            
            String S = read.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.longestPalindrome(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    public static boolean solve(String str){
        int i=0; int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;j--;
        }
        return true;
    }
    String longestPalindrome(String S){
        // code here
        if(S.length()==1)return S;
        String st="";
        for(int i=S.length(); i>0; i--){
            for(int j=0; j<S.length()-i+1; j++){
                st = S.substring(j, i+j);
                if(solve(st)){
                    return st;
                }
            }
        }
        return "";
    }
}
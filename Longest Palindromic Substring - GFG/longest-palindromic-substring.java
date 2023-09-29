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
    String longestPalindrome(String S){
        // code here
        String str ="";
        for(int i=S.length(); i>=0; i--){
            for(int j=0; j<S.length()-i+1; j++){
                str = S.substring(j, i+j);
                if(swap(str)){
                    return str;
                }
            }
        }
        return "";
    }
    public static boolean swap(String str){
        int i=0, j= str.length()-1;
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;
    }
}
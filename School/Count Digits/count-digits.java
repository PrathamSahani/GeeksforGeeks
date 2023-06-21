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
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.evenlyDivides(N));
        }
    }
}
// } Driver Code Ends


class Solution{
    static int evenlyDivides(int N){
        int a = N;
        int count =0;
        while(a>0){
          int b = a%10;
            if(b>0 && N%b==0){
                count++;
            }
            a/=10;
        }
        return count;

      
    }
}
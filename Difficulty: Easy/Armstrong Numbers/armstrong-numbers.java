//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.armstrongNumber(n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    static String armstrongNumber(int n) {
        // code here
        int temp =n;
        int ans =0;
        while(temp!=0){
            int rem = temp%10;
            ans+=rem*rem*rem;
            temp = temp/10;
            
        }
        if(ans==n)return "true";
        else
        return "false";
    }
}
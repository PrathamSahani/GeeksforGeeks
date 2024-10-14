//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            Long A = Long.parseLong(S[0]);
            Long B = Long.parseLong(S[1]);

            Solution ob = new Solution();
            Long[] ptr = ob.lcmAndGcd(A,B);
            
            System.out.print(ptr[0]);
            System.out.print(" ");
            System.out.println(ptr[1]);
        }
    }
}
// } Driver Code Ends




class Solution {
    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        Long[] ab = new Long[2];
        
        Long a1 = A;
        Long b1= B;
        while(A>0 && B>0){
            if(A>B){
                A = A%B;
            }else{
                B = B%A;
            }
        }
        if(A==0)
        ab[1] = B;
        else
        ab[1]= A;
        
        ab[0] = ( a1*b1)/ab[1];
        return ab;
 


 
    }
};
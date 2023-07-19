//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String input_line[] = read.readLine().trim().split("\\s+");
            int N = Integer.parseInt(input_line[0]);
            long L = Long.parseLong(input_line[1]); 
            long R = Long.parseLong(input_line[2]); 
            input_line = read.readLine().trim().split("\\s+");
            int A[]= new int[N];
            for(int i = 0; i < N; i++)
                A[i] = Integer.parseInt(input_line[i]);
            Solution ob = new Solution();
            long ans = ob.countSubarray(N, A, L, R); 
            System.out.println(ans);
        }
    } 
} 
// } Driver Code Ends

class Solution 
{ 
    long countSubarray(int N,int A[],long L,long R) {
        // code here
        long ans1 = count(A, N, L-1);
        long ans2 = count(A, N, R);
        
        return ans2 - ans1;
    }
    
    public static long count(int A[], long N, long X){
        long sum = 0;
        long ans = 0;int  l = 0;
        for(int r = 0; r < N ; r++){
            sum += A[r];
            
            while(sum > X){
                sum -= A[l];
                l++;
            }
            
            ans += r - l + 1;
        }
        
        return ans;
    } 
} 
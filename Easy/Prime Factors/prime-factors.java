//{ Driver Code Starts


import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int N = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int[] ans = ob.AllPrimeFactors(N);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends




class Solution
{
    static boolean isPrime(int n){
        if(n<=1)return false;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public int[] AllPrimeFactors(int N)
    {
        // code here
         ArrayList<Integer> list = new ArrayList<>();
         for(int i=2; i<=N; i++){
         if(N%i==0){
             if(isPrime(i)){
                 list.add(i);
             }
         }
         }
       int ans[] = new int[list.size()];
       int k=0; 
       for(int val: list)
           ans[k++] = val;
           return ans;
       
    }
}
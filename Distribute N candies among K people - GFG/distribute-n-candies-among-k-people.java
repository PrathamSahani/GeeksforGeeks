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
            int N = Integer.parseInt(S[0]);
            int K = Integer.parseInt(S[1]);

            Solution ob = new Solution();
            Long[] res = ob.distributeCandies(N,K);
            
            for(int i=0; i<K; i++)
                System.out.print(res[i] + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static Long[] distributeCandies(int n, int k) {
        // code here
        Long ans[] = new Long[k];
        Arrays.fill(ans, 0L);
        int start =0;
        while(n>0){
            if(n>start){
                ans[start%k]+=(start+1);
                n = n-start-1;
                start+=1;
            }else{
                ans[start%k]+=n;
                break;
            }
        }
        return ans;
        
    }
};
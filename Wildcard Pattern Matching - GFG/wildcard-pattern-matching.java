//{ Driver Code Starts
import java.util.*;

class WildcardPattern
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String pat = sc.nextLine();
			String text = sc.nextLine();
			Solution g = new Solution();
			System.out.println(g.wildCard(pat,text));
			t--;
		}
	}
}
// } Driver Code Ends


class Solution
{
    static boolean f(String s, int i){
        for(int j=1; j<=i; j++){
            if(s.charAt(j-1)!='*')return false;
        }
        return true;
    }
    int wildCard(String s1, String s2)
    {
        // Your code goes here
        int n = s1.length(), m = s2.length();
         boolean dp[][] = new boolean[n+1][m+1];
         dp[0][0] = true;
         for(int i=1; i<=n; i++){
            //  dp[i][0] = false;
            dp[i][0] = f(s1, i);
         }
         for(int j=1; j<=m; j++){
            //  dp[0][j] = s2.charAt(j-1)=='*' && dp[0][j-1];
            dp[0][j] = false;
         }
         for(int i=1; i<=n; i++){
             for(int j=1; j<=m; j++){
                 if(s1.charAt(i-1)==s2.charAt(j-1) || s1.charAt(i-1)=='?')
                 dp[i][j] = dp[i-1][j-1];
                 else if(s1.charAt(i-1)=='*')
                 dp[i][j] = dp[i-1][j] || dp[i][j-1];
                 else 
                 dp[i][j] = false;
             }
         }
         return dp[n][m]?1:0;
    }
}

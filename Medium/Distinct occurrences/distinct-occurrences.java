//{ Driver Code Starts
import java.util.*;

class Distinct_Occurrences
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String line = sc.nextLine();
			String S = line.split(" ")[0];
			String T = line.split(" ")[1];
			
			Solution ob = new Solution();
			System.out.println(ob.subsequenceCount(S,T));
			t--;
		}
	}
}
// } Driver Code Ends


/*You are required to complete this method*/

class Solution
{
      static int mod = (int)(Math.pow(10, 9)+7);
    int  subsequenceCount(String s, String t)
    {
	// Your code here	
        int n = s.length();
 int m = t.length();
         int[][]dp = new int[m+1][n+1];
        for(int j=0; j<=n; j++){
            dp[0][j] =1;

        }
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n;j++){
                if(t.charAt(i-1)==s.charAt(j-1)){
                    dp[i][j] = (dp[i-1][j-1]%mod+dp[i][j-1]%mod)%mod;
                }else{
                    dp[i][j] = dp[i][j-1]%mod;
                }
            }
        }
        return dp[m][n]%mod;    
    }
}
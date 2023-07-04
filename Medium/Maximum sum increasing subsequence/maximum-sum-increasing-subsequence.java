//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int Arr[] = new int[n];
                    for(int i = 0;i<n;i++)
                        Arr[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.maxSumIS(Arr,n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
	public int maxSumIS(int arr[], int n)  
	{  
	    //code here.
	    int[] dp = new int[n];
int[] ans = Arrays.copyOf(arr, n);

Arrays.fill(dp, 1);

for (int i = 1; i < n; i++) {
    for (int j = 0; j < i; j++) {
        if (arr[j] < arr[i] && dp[j] == dp[i]) {
            dp[i]++;
            ans[i] = Math.max(ans[i], arr[i] + ans[j]);
        }
    }
}

int maxElement = Integer.MIN_VALUE;
for (int element : ans) {
    maxElement = Math.max(maxElement, element);
}

return maxElement;

	}  
}
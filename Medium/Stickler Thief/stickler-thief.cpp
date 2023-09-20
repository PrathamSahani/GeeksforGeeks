//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;
typedef long long int ll;

// } Driver Code Ends
class Solution
{
 private : 
    int solve(int arr[],int n,int idx,vector<int>&dp){
        
              if(idx>=n)  return 0;
               if(dp[idx]!=-1) return dp[idx];
                  //picking the element
            int pick=  arr[idx]+solve(arr,n,idx+2,dp);
              //not picking the element
           int notpick=  0+solve(arr,n,idx+1,dp);
            return dp[idx]= max(pick,notpick);
    }
    public:
    int FindMaxSum(int arr[], int n)
    {
        vector<int>dp(n,-1);
        return solve(arr,n,0,dp);
    }


};

//{ Driver Code Starts.
int main()
{
    //taking total testcases
	int t;
	cin>>t;
	while(t--)
	{
	    //taking number of houses
		int n;
		cin>>n;
		int a[n];
		
		//inserting money of each house in the array
		for(int i=0;i<n;++i)
			cin>>a[i];
		Solution ob;
		//calling function FindMaxSum()
		cout<<ob.FindMaxSum(a,n)<<endl;
	}
	return 0;
}

// } Driver Code Ends
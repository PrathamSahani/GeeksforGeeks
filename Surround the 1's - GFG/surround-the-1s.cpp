//{ Driver Code Starts

#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends

class Solution {
public:
    int Count(vector<vector<int> >& mat) {
        int n=mat.size(),m=mat[0].size(),ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int cnt=0;
                if(mat[i][j]==1){
                    if(i-1>=0 and mat[i-1][j]==0) cnt++;
                    if(j-1>=0 and mat[i][j-1]==0) cnt++;
                    if(i+1<n and mat[i+1][j]==0) cnt++;
                    if(j+1<m and mat[i][j+1]==0) cnt++;
                    if(i-1>=0 and j-1>=0 and mat[i-1][j-1]==0) cnt++;
                    if(i+1<n and j+1<m and mat[i+1][j+1]==0) cnt++;
                    if(i+1<n and j-1>=0 and mat[i+1][j-1]==0) cnt++;
                    if(i-1>=0 and j+1<m and mat[i-1][j+1]==0) cnt++;
                }
                if(cnt>0 and cnt%2==0) ans++;
            }
        }
        return ans;
    }
};

//{ Driver Code Starts.
int main(){
	int tc;
	cin >> tc;
	while(tc--){
		int n, m;
		cin >> n >> m;
		vector<vector<int>> matrix(n, vector<int>(m,0));
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				cin >> matrix[i][j];
			}
		}
		Solution ob;
		int ans = ob.Count(matrix);
		cout << ans <<"\n";
	}
	return 0;
}
// } Driver Code Ends
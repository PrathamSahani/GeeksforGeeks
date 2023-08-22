//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution {
public:
int dir[8] = {-1,-1,0,1,1,1,0,-1};
int dic[8] = {0,1,1,1,0,-1,-1,-1};
bool isvalid(int row, int col, int n, int m)
{
    if (row < 0 || row >= n || col < 0 || col >= m)
        return 0;
    return 1;
}
bool check1(int row,int col,int i, vector<vector<char>> &grid,string &st,int ind){
    bool p=0;
    while(isvalid(row,col,grid.size(),grid[0].size())&&ind<st.size()&& grid[row][col]==st[ind]){
        row+=dir[i];
        col+=dic[i];
        ind++;
    }
    return ind==st.size()?1:0;
}
bool check(int row, int col, vector<vector<char>> &grid, string &str, int j)
{  
    if(j==str.size()) return 1;
    bool p = 0;
    for (int i = 0; i < 8; i++)
    {
        int nrow = row + dir[i];
        int ncol = col + dic[i];
        if (isvalid(nrow, ncol, grid.size(), grid[0].size()) && grid[nrow][ncol] == str[1])
        {
            p |= check1(nrow, ncol,i, grid, str, j);
        }
    }
    return p;
}
vector<vector<int>> searchWord(vector<vector<char>> grid, string word)
{
    vector<vector<int>> ans;
    int n = grid.size(), m = grid[0].size();
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            if (grid[i][j] == word[0])
            {   
                if (check(i, j, grid, word, 1))
                {
                    ans.push_back({i, j});
                }
            }
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
		vector<vector<char>>grid(n, vector<char>(m,'x'));
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++)
				cin >> grid[i][j];
		}
		string word;
		cin >> word;
		Solution obj;
		vector<vector<int>>ans = obj.searchWord(grid, word);
		if(ans.size() == 0)
		{
		    cout<<"-1\n";
		}
		else
		{
		    for(auto i: ans){
			for(auto j: i)
				cout << j << " ";
			cout << "\n";
		    }
		}
		
		
	}
	return 0;
}
// } Driver Code Ends
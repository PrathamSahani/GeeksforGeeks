//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends

class Solution {
  public:
    vector<int> antiDiagonalPattern(vector<vector<int>> matrix) 
    {
        vector<int> ans;
        int pi = 0, pj = 0, n = matrix.size(), m = matrix[0].size();
        for(int j = 0; j < m; j++) {
            pi = 0;
            pj = j;
            while(pi < n && pj >= 0) {
                ans.push_back(matrix[pi][pj]);
                pi++;
                pj--;
            }
        }
        for(int i = 1; i < n; i++) {
            pi = i;
            pj = m - 1;
            while(pi < n && pj >= 0) {
                ans.push_back(matrix[pi][pj]);
                pi++;
                pj--;
            }
        }
        return ans;
    }
};
 



//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;

    while (t--) {
        int n;
        cin >> n;
        vector<vector<int>> matrix;
        matrix.resize(n, vector<int>(n));

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cin >> matrix[i][j];
            }
        }

        Solution ob;
        vector<int> ans = ob.antiDiagonalPattern(matrix);
        for (int i = 0; i < ans.size(); ++i) cout << ans[i] << " ";
        cout << endl;
    }
    return 0;
}
// } Driver Code Ends
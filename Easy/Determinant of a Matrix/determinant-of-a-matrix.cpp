//{ Driver Code Starts
#include <bits/stdc++.h> 
using namespace std; 

// } Driver Code Ends


class Solution{
    private:
    void genNewMat(vector<vector<int>>& M, vector<vector<int>>& m, int c, int n){
        int x = 0, y = 0;
        
        for(int i{1}; i<n; i++){
            for(int j{}; j<n; j++){
                if(j == c) continue;
                m[x][y++] = M[i][j];
            }
            x++;
            y = 0;
        }
    }
    
    public:
    int determinantOfMatrix(vector<vector<int>> matrix, int n){
        if(n == 0)
            return 0;
        else if(n == 1)
            return matrix[0][0];
        
        int sign = 1, det = 0;
        vector<vector<int>> newMat(n-1, vector<int>(n-1));
        
        for(int i{}; i<n; i++){
            // Optimization
            // No need to calculate the determinant, if the cell value is `0`
            if(matrix[0][i] != 0){
                genNewMat(matrix, newMat, i, n);
                det += sign * matrix[0][i] * determinantOfMatrix(newMat, n-1);
            }
            sign *= -1;
        }
        
        return det;
    }
};
 


//{ Driver Code Starts.
int main() {
    int t;
    cin>>t;
    
    while(t--) 
    {
        int n;
        cin>>n;
        vector<vector<int> > matrix(n); 

        for(int i=0; i<n; i++)
        {
            matrix[i].assign(n, 0);
            for( int j=0; j<n; j++)
            {
                cin>>matrix[i][j];
            }
        }

        Solution ob;
        int result = ob.determinantOfMatrix(matrix, n);
        cout<<result<<endl;
    }
    return 0;
}
// } Driver Code Ends
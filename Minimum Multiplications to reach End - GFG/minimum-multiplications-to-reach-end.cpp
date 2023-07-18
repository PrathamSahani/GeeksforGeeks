//{ Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
// User function Template for C++

class Solution {
  public:
   int mod = 100000;
    int minimumMultiplications(vector<int>& arr, int start, int end) {
        // code here
        queue<pair<int,int>> q;
        q.push({0,start});
        vector<int> dist(1e5,1e9);
        //as starting distance is 0;
        dist[start] = 0;
        while(!q.empty()){
            auto it = q.front();
            int op = it.first;
            int from = it.second;
            if(from==end) return op;
            q.pop();
            for(int i = 0;i<arr.size();i++){
                int to = (from*arr[i])%mod;
                if(op+1<dist[to]){
                    dist[to] = op + 1;
                    q.push({op+1,to});
                }
            }
        }
        return dist[end]==1e9?-1:dist[end];
    }
};


//{ Driver Code Starts.

int main() {

    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        vector<int> arr(n);
        for (int i = 0; i < n; i++) {
            cin >> arr[i];
        }
        int start, end;
        cin >> start >> end;
        Solution obj;
        cout << obj.minimumMultiplications(arr, start, end) << endl;
    }
}

// } Driver Code Ends
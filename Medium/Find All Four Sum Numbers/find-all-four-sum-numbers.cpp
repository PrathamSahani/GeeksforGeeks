//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
// User function template for C++

class Solution{
    public:
    // arr[] : int input array of integers
    vector<vector<int> > fourSum(vector<int> &arr, int k) {
        vector<vector<int>>ans;
        
        int n=arr.size();
    
        sort(arr.begin(),arr.end());
        int b=0;
        //for first element of quadrupl
        for(int i=0;i<n;){
            int x=arr[i];
            int j=i+1;
            //for second element of quadrupl
            while(j<n){
                int y=arr[j];
                int l=j+1,m=n-1;
                
                while(l<m){
                    int z=arr[l],a=arr[m];
                    if(x+y+z+a==k){
                        ans.push_back({x,y,z,a});
                        //when we get c then we try to ignore same value of l 
                        while(l<m && arr[l]==z){
                            l++;
                        }
                             //when we get quadrupl then we try to ignore same value of m 
                        while(l<m && m>0 && arr[m]==a){
                            m--;
                        }
                        
                    }
                    //sum is greater then k so we reduce the sum
                    else if(x+y+z+a>k){
                          m--;
                    }
                    //sum is less then k so we increment the sum
                    else{
                         l++;
                    }
                }
               //when we get quadrupl then we try to ignore same value of j and incase it does not equal then 
            // we try increment by 1 
                 while(j<n && arr[j]==y){
                        j++;
                        }
                
                
                
                
            }
        //when we get quadrupl then we try to ignore same value of i and incase it does not equal then 
            // we try increment by 1   
            while(i<n && arr[i]==x){
                            i++;
                        }
            
            
        }
        //finally we are returning the ans
        return ans;
    }
};

//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        int n, k, i;
        cin >> n >> k;
        vector<int> a(n);
        for (i = 0; i < n; i++) {
            cin >> a[i];
        }
        Solution ob;
        vector<vector<int> > ans = ob.fourSum(a, k);
        for (auto &v : ans) {
            for (int &u : v) {
                cout << u << " ";
            }
            cout << "$";
        }
        if (ans.empty()) {
            cout << -1;
        }
        cout << "\n";
    }
    return 0;
}
// } Driver Code Ends
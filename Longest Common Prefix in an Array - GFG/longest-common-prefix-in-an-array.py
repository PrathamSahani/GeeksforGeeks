#User function Template for python3

class Solution:
    def longestCommonPrefix(self, arr, n):
        # code here
        ans = arr[0]
        for i in range(len(arr)):
            while arr[i].find(ans)!=0:
                ans = ans[:-1]
            if len(ans)==0:
                return "-1";
                
        return ans;


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__=='__main__':
    t=int(input())
    for _ in range(t):
        n = int(input())
        arr = [x for x in input().strip().split(" ")]
        
        ob=Solution()
        print(ob.longestCommonPrefix(arr, n))
# } Driver Code Ends
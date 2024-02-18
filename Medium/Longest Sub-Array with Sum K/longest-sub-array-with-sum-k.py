#User function Template for python3

class Solution:
    def lenOfLongSubarr(self, arr, n, k):
        sum_val = 0
        ans = 0
        sum_map = {}
        for i in range(n):
            sum_val += arr[i]
            if sum_val == k:
                ans = i + 1
            if sum_val not in sum_map:
                sum_map[sum_val] = i
            if sum_val - k in sum_map:
                ans = max(ans, i - sum_map[sum_val - k])
        return ans

      



#{ 
 # Driver Code Starts
#Initial Template for Python 3


for _ in range(0,int(input())):
    
    n, k = map(int , input().split())
    arr = list(map(int,input().strip().split()))
    ob = Solution()
    print(ob.lenOfLongSubarr(arr, n, k))




# } Driver Code Ends
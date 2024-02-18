#Your task is to complete this function
#Your should return the required output
class Solution:
    def maxLen(self, n, arr):
        #Code here
        sum_val =0
        ans =0
        k =0
        sum_map = {}
        for i in range(n):
            sum_val+=arr[i]
            if sum_val ==k:
                ans =i+1
            if sum_val not in sum_map:
                sum_map[sum_val] =i
            if sum_val-k in sum_map:
                ans = max(ans, i-sum_map[sum_val-k])
        
        return ans
            
            
            
#{ 
 # Driver Code Starts
if __name__=='__main__':
    t= int(input())
    for i in range(t):
        n = int(input())
        arr = list(map(int, input().strip().split()))
        ob = Solution()
        print(ob.maxLen(n ,arr))
# Contributed by: Harshit Sidhwa
# } Driver Code Ends
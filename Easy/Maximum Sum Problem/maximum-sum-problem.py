#User function Template for python3

class Solution:
    def maxSum(self, n): 
        # code here 
        if n<=11:
            return n
        if n==12:
            return 13
        ans =0
        ans+=self.maxSum(n//2)+ self.maxSum(n//3)+ self.maxSum(n//4)
        return ans
        
        



#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__': 
    t = int(input())
    for _ in range(t):
        n = int(input())
        ob = Solution()
        print(ob.maxSum(n))
# } Driver Code Ends
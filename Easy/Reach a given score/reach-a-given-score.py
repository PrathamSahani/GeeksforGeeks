#User function Template for python3

class Solution:
    def count(self, n: int) -> int:
        # Initialize dp array with zeros
        dp = [0] * (n + 1)
        dp[0] = 1  # Base case: one way to reach score 0

        # Possible moves: 3, 5, and 10
        moves = [3, 5, 10]

        for move in moves:
            for i in range(move, n + 1):
                dp[i] += dp[i - move]

        return dp[n]


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == "__main__":
    for _ in range(int(input())):
        n = int(input())
        ob = Solution()
        print(ob.count(n))
        
# } Driver Code Ends
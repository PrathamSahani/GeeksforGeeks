#User function Template for python3

from collections import Counter
from heapq import heappop, heappush, heapify

class Solution:
    def minValue(self, s, k):
        C = [-num for num in Counter(s).values()]
        heapify(C)
        while k:
            val = -heappop(C)
            val -= 1
            heappush(C, -val)
            k -= 1
            
        return sum(num ** 2 for num in C)
        
        


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        s = input()
        k = int(input())
        
        ob = Solution()
        print(ob.minValue(s, k))
# } Driver Code Ends
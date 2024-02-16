#User function Template for python3

from math import sqrt

class Solution:
    def isPrime (self, n):
        # code here
        if n<=1:
            return 0
        else:  
            for i in range(2, int(sqrt(n))+1):
                if n%i==0:
                    return 0
            return 1


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__': 
    t = int (input ())
    for _ in range (t):
        N = int(input())
       

        ob = Solution()
        print(ob.isPrime(N))
# } Driver Code Ends
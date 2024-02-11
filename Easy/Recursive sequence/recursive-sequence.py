#User function Template for python3

class Solution:
    def sequence(self, n):
        # code here
        s=0    #sum
        d=1    #digit
        m=1000000007
        for i in range(1,n+1):
            v=1   #product of digits
            for j in range(i):
                v=(v*d)%m
                d+=1
            s=(s+v)%m
        return s


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        N = int(input())
        
        ob = Solution()
        print(ob.sequence(N))
# } Driver Code Ends
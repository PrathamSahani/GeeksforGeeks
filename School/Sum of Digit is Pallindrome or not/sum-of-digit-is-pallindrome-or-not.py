#User function Template for python3

class Solution:
    def isDigitSumPalindrome(self,N):
        #code here
        sum = 0
        res = str(N)
        still = N
        
        while still>0:
            sum+=still%10
            still//=10
            
            
        temp = sum
        ans = 0
        while temp>0:
            rem =temp%10
            ans = ans*10+rem
            temp//=10
        
        if ans==sum:
            return 1
        else:
            return 0
        
        


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__=='__main__':
    t=int(input())
    for _ in range(t):
        N=int(input())
        ob=Solution()
        print(ob.isDigitSumPalindrome(N))
# } Driver Code Ends
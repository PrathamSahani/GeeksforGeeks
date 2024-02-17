
class Solution:
    def nthFibonacci(self, n : int) -> int:
        # code here
        
        a=1
        b=1
        if n<=2:
            return 1
        while n-2:
            res = (a+b)%1000000007
            a =b
            b = res
            n-=1
        return res
        
        
        






#{ 
 # Driver Code Starts
if __name__=="__main__":
    t = int(input())
    for _ in range(t):
        
        n = int(input())
        
        obj = Solution()
        res = obj.nthFibonacci(n)
        
        print(res)
        

# } Driver Code Ends
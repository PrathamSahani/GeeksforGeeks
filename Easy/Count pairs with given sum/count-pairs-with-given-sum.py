#User function Template for python3

class Solution:
    def getPairsCount(self, arr, n, k):
        # code here
       
        total = 0
        dict1 = {}
        for num in arr:
            if num in dict1:
                total += dict1[num]
            if k-num in dict1:
                dict1[k-num] += 1
            else:
                dict1[k-num] = 1
        return total





#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    tc = int(input())
    while tc > 0:
        n, k = list(map(int, input().strip().split()))
        arr = list(map(int, input().strip().split()))
        ob = Solution()
        ans = ob.getPairsCount(arr, n, k)
        print(ans)
        tc -= 1

# } Driver Code Ends
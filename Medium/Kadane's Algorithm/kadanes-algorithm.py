#User function Template for python3

class Solution:
    ##Complete this function
    #Function to find the sum of contiguous subarray with maximum sum.
    def maxSubArraySum(self,arr,n):
        ##Your code here
        maxi = float('-inf')
        sum = 0
        for i in range(n):
            sum += arr[i]
            if sum > maxi:
                maxi = sum
            if sum < 0:
                sum = 0
        return maxi
#{ 
 # Driver Code Starts
#Initial Template for Python 3

import math

 
def main():
        T=int(input())
        while(T>0):
            
            n=int(input())
            
            arr=[int(x) for x in input().strip().split()]
            
            ob=Solution()
            
            print(ob.maxSubArraySum(arr,n))
            
            T-=1


if __name__ == "__main__":
    main()
# } Driver Code Ends
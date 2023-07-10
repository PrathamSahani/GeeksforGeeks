#User function template for Python 3

class Solution:
    def majorityElement(self, A, N):
        #Your code here
        A.sort()
        count =1
        if N==1:
            return A[0]
        for i in range(1, N):
            if A[i]==A[i-1]:
                count = count+1
            else:
                count =1
            if count>N/2:
                return A[i]
        return -1      

#{ 
 # Driver Code Starts
#Initial Template for Python 3

import math

from sys import stdin


def main():
        T=int(input())
        while(T>0):
            
            N=int(input())

            A=[int(x) for x in input().strip().split()]
            
            
            obj = Solution()
            print(obj.majorityElement(A,N))
            
            T-=1


if __name__ == "__main__":
    main()
# } Driver Code Ends
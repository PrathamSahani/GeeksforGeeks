#User function Template for python3

class Solution:
    def segregateElements(self, arr, n):
        # Your code goes here
       list1 = []
       list2 =[]
       for num in arr:
            if num<0:
               list1.append(num)
            else:
                list2.append(num)
                
       list2.extend(list1)
       for i in  range(len(arr)):
            arr[i] = list2[i]


#{ 
 # Driver Code Starts
#Initial Template for Python 3


def main():

    T = int(input())

    while(T > 0):
        n = int(input())
        a = [int(x) for x in input().strip().split()]
        ob=Solution()
        ob.segregateElements(a, n)
        print(*a)

        T -= 1


if __name__ == "__main__":
    main()





    
# } Driver Code Ends
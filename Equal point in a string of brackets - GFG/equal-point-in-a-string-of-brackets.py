#User function Template for python3

class Solution:
    def findIndex(self,str):
        # Your code goes here 
        count =0
        for i in range(len(str)):
            if str[i]==')':
                count = count+1
                
        return count



#{ 
 # Driver Code Starts
#Initial Template for Python 3

def main():

    T = int(input())

    while(T > 0):
        str = input()
        ob=Solution()
        print(ob.findIndex(str))

        T -= 1


if __name__ == "__main__":
    main()
# } Driver Code Ends
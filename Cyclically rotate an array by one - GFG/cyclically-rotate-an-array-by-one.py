#User function Template for python3

def rotate( arr, n):
     a = [0] * n
     a[0] = arr[n-1]
     for i in range(1, n):
         a[i] = arr[i-1]
     for i in range(n):
         arr[i] = a[i]
    



#{ 
 # Driver Code Starts
#Initial Template for Python 3

def main():

    T = int(input())

    while(T > 0):
        n = int(input())
        a = [int(x) for x in input().strip().split()]
        rotate(a, n)
        print(*a)

        T -= 1


if __name__ == "__main__":
    main()





    
# } Driver Code Ends
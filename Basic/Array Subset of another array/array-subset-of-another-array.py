#User function Template for python3

def isSubset( a1, a2, n, m):
  
    a1.sort()
    a2.sort()
    
    if len(a2) > len(a1):
        return "No"
    
    i = 0
    j = 0
    
    while j < len(a2) and i < len(a1):
        if a2[j] == a1[i]:
            i += 1
            j += 1
        else:
            i += 1
    
    if j == len(a2):
        return "Yes"
    else:
        return "No"
        
        
        


#{ 
 # Driver Code Starts
#Initial Template for Python 3


def main():

    T = int(input())

    while(T > 0):
        sz = [int(x) for x in input().strip().split()]
        n, m = sz[0], sz[1]
        a1 = [int(x) for x in input().strip().split()]
        a2 = [int(x) for x in input().strip().split()]
        
        print(isSubset( a1, a2, n, m))

        T -= 1


if __name__ == "__main__":
    main()

# } Driver Code Ends
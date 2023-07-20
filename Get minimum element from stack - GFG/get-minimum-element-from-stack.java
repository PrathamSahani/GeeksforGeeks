//{ Driver Code Starts
import java.util.*;



class Get_Min_From_Stack
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int q = sc.nextInt();
			GfG g = new GfG();
			while(q>0)
			{
				int qt = sc.nextInt();
				
				if(qt == 1)
				{
					int att = sc.nextInt();
					g.push(att);
					//System.out.println(att);
				}
				else if(qt == 2)
				{
					System.out.print(g.pop()+" ");
				}
				else if(qt == 3)
				{
					System.out.print(g.getMin()+" ");
				}
			
			q--;
			}
			System.out.println();
		T--;
		}
		
	}
}



// } Driver Code Ends

 
class GfG
{
    int minEle;
    Stack<Integer> stack;
    
    // Constructor    
    GfG()
{
        stack = new Stack<>();
        minEle = Integer.MAX_VALUE;
}
 
    /*returns min element from stack*/
    int getMin()
    {if (stack.isEmpty()) {
            return -1;
        }
        return minEle;
    }
    
    /*returns poped element from stack*/
    int pop()
    {
if (stack.isEmpty()) {
            return -1;
        }
        int poppedElement = stack.pop();
        if (poppedElement == minEle) {
            minEle = stack.pop();
        }
        return poppedElement;
    }
 
    /*push element x into the stack*/
    void push(int x)
    { if (x <= minEle) {
            stack.push(minEle);
            minEle = x;
        }
        stack.push(x);
    }
}

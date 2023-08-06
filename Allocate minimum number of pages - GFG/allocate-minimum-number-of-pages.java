//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int m=sc.nextInt();
		    Solution ob = new Solution();
		    System.out.println(ob.findPages(a,n,m));
		}
	}
}
// } Driver Code Ends



class Solution 
{
    //Function to find minimum number of pages.
    public static int f(ArrayList<Integer> arr, int pages){
        int n = arr.size();
        int student = 1;
        long page = 0;
        for (int i = 0; i < n; i++) {
            if (page + arr.get(i) <= pages) {
                page += arr.get(i);
            } else {
                student++;
                page = arr.get(i);
            }
        }
        return student;
    }

    public static int findPages(int[] A, int N, int M) {
        //Your code here
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            arr.add(A[i]);
        }

        if (M > N) return -1;
        int low = Collections.max(arr);
        int high = arr.stream().mapToInt(Integer::intValue).sum();
        while (low <= high) {
            int mid = (low + high) / 2;
            int student = f(arr, mid);
            if (student > M)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return low;
    }
};

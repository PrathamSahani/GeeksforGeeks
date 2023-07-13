//{ Driver Code Starts
//Initial template for JAVA

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    for(int i=0;i<t;i++){
	        int n = Integer.parseInt(br.readLine());
	        String l = br.readLine();
    		String[] sarr = l.split(" ");
    		int[] arr = new int[sarr.length];
    		for(int i1=0;i1<arr.length;i1++){
    			arr[i1] = Integer.parseInt(sarr[i1]);
    		}
    		
            Solution obj = new Solution();
            
            int[] res = obj.twoRepeated(arr, n);
            System.out.println(res[0] + " " + res[1]);
	    }
	}
}
// } Driver Code Ends


//User function template for JAVA

class Solution
{
    //Function to find two repeated elements.
    public int[] twoRepeated(int arr[], int n)
    {
          boolean first = false;
        int[] res = new int[2];
        
        //iterating over the array elements.
        for(int p=0;p<n+2;p++)
        {
            //making the visited elements negative.
		    if(arr[Math.abs(arr[p])] > 0)
		    {
		        arr[Math.abs(arr[p])] = -arr[Math.abs(arr[p])];
		    }
		    //if the number is negative, it was visited previously
            //so this would be the repeated element.
		    else
		    {
		        //storing first and second repeated element accordingly.
		        if(first==false)
	            {
	                res[0] = Math.abs(arr[p]);
	                first = true;
	            }
		        else
		            res[1] = Math.abs(arr[p]);
		            
		    }
        }
        //returning the result.
        return res;
    }
}
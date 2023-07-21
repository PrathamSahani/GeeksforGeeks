//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    long n = Long.parseLong(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[(int)n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    System.out.println(new Solution().getMaxArea(arr, n));
		}
	}
}




// } Driver Code Ends

// import java.util.Stack;

class Solution {
    // Function to find the largest rectangular area possible in a given histogram.
    public static long getMaxArea(long heights[], long n) {
        long maxArea = 0;
        Stack<Long> stack = new Stack<>();

        for (int i = 0; i <= n; i++) { // Changed 'heights.length' to 'n'
            while (!stack.isEmpty() && (i == n || heights[i] < heights[stack.peek().intValue()])) {
                long height = heights[stack.pop().intValue()];
                long width;
                if (stack.isEmpty()) {
                    width = i;
                } else {
                    width = i - stack.peek() - 1;
                }
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push((long) i); // Explicitly cast 'i' to 'long'
        }

        return maxArea;
    }
}


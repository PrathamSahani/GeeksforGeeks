//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input_line1[] = read.readLine().trim().split("\\s+");
            int k = Integer.parseInt(input_line1[0]);
            int n = Integer.parseInt(input_line1[1]);
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[n];
            for(int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.minTime(arr,n,k));
        }
    }
}


// } Driver Code Ends


class Solution {
    static long minTime(int[] arr, int n, int k) {
        // Find the maximum element in the array.
        int maxElement = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            maxElement = Math.max(maxElement, arr[i]);
        }
        
          long totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }
      
        long low = maxElement; 
        long high = totalSum;   

        while (low < high) {
            long mid = low + (high - low) / 2;
            int paintersRequired = getPaintersRequired(arr, n, mid);

            if (paintersRequired <= k) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        
        return low; 
    }
    
    
    static int getPaintersRequired(int[] arr, int n, long timeLimit) {
        int painters = 1;
        long currentSum = 0;
        
        for (int i = 0; i < n; i++) {
            if (currentSum + arr[i] > timeLimit) {
                painters++;
                currentSum = arr[i];
            } else {
                currentSum += arr[i];
            }
        }
        
        return painters;
    }
}



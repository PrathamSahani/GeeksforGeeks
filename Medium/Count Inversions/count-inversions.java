//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Sorting
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];
            
            for(long i = 0; i < n; i++)
             arr[(int)i] = sc.nextLong();
             
            System.out.println(new Solution().inversionCount(arr, n));
            
        }
    }
}

// } Driver Code Ends


class Solution {
    // arr[]: Input Array
    // N : Size of the Array arr[]
    // Function to count inversions in the array.
    private static long merge(long arr[], long low, long mid, long high) {
        ArrayList<Long> list = new ArrayList<>();
        long left = low;
        long right = mid + 1;
        long cnt = 0;
        while (left <= mid && right <= high) {
            if (arr[(int) left] <= arr[(int) right]) {
                list.add(arr[(int) left]);
                left++;
            } else {
                list.add(arr[(int) right]);
                cnt += (mid - left + 1);
                right++;
            }
        }
        while (left <= mid) {
            list.add(arr[(int) left]);
            left++;
        }
        while (right <= high) {
            list.add(arr[(int) right]);
            right++;
        }
        for (int i = (int) low; i <= high; i++) {
            arr[i] = list.get(i - (int) low);
        }
        return cnt;
    }

    public static long merge(long[] arr, long low, long high) {
        long cnt = 0;
        if (low < high) { // Corrected the condition from low <= high
            long mid = (low + high) / 2;
            cnt += merge(arr, low, mid);
            cnt += merge(arr, mid + 1, high);
            cnt += merge(arr, low, mid, high);
        }
        return cnt;
    }

    static long inversionCount(long arr[], long N) {
        // Your Code Here
        return merge(arr, 0, N - 1);
    }
}

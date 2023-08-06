//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(a[i]);
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.nextPermutation(N, arr);
            StringBuilder out = new StringBuilder();
            for(int i = 0;i < N;i++)
                out.append(ans.get(i) + " ");
            System.out.println(out);
        }
    }
}
// } Driver Code Ends



public class Solution {
    static List<Integer> nextPermutation(int N, int arr[]) {
        // Find the longest suffix that is in non-increasing order
        int i = N - 2;
        for (; i >= 0 && arr[i] >= arr[i + 1]; i--);

        if (i >= 0) {
            // Find the smallest element in the suffix that is greater than arr[i]
            int j = N - 1;
            for (; j > i && arr[j] <= arr[i]; j--);

            // Swap arr[i] and arr[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        // Reverse the suffix to get the next permutation
        reverseSuffix(arr, i + 1, N - 1);

        // Convert the array to a List and return
        List<Integer> result = new ArrayList<>();
        for (int num : arr) {
            result.add(num);
        }
        return result;
    }

    static void reverseSuffix(int[] arr, int start, int end) {
        for (; start < end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }
}

//{ Driver Code Starts
import java.util.*;

class MaxLenZeroSumSub
{

    // Returns length of the maximum length subarray with 0 sum

    // Drive method
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GfG g = new GfG();
            System.out.println(g.maxLen(arr, n));
            T--;
        }
    }
}
// } Driver Code Ends




class GfG {
    int maxLen(int arr[], int n) {
        // Initialize a HashMap to store cumulative sums and their indices
        HashMap<Integer, Integer> map = new HashMap<>();
        // Initialize variables to keep track of maximum length and cumulative sum
        int maxLen = 0;
        int sum = 0;

        // Traverse the array
        for (int i = 0; i < n; i++) {
            // Add current element to cumulative sum
            sum += arr[i];

            // If the sum becomes 0, update maxLen to current index + 1
            if (sum == 0)
                maxLen = i + 1;

            // If the sum is already present in the map, update maxLen
            if (map.containsKey(sum))
                maxLen = Math.max(maxLen, i - map.get(sum));
            else // Otherwise, put the sum in the map with its index
                map.put(sum, i);
        }

        // Return the maximum length of sub-array with sum 0
        return maxLen;
    }
}

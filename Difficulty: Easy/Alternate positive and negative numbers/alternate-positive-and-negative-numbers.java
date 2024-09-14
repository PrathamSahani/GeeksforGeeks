//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String input = br.readLine();
            String[] inputArray = input.split("\\s+");
            ArrayList<Integer> arr = new ArrayList<>();

            for (String s : inputArray) {
                arr.add(Integer.parseInt(s));
            }

            new Solution().rearrange(arr);
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


// import java.util.*;

class Solution {
    void rearrange(ArrayList<Integer> arr) {
        int n = arr.size();
        Queue<Integer> pos = new LinkedList<>();
        Queue<Integer> neg = new LinkedList<>();
        
        // Split numbers into positive and negative queues
        for (int i = 0; i < n; i++) {
            if (arr.get(i) >= 0) {
                pos.add(arr.get(i));
            } else {
                neg.add(arr.get(i));
            }
        }
        
        // Rearrange the elements
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) { // Even index
                if (!pos.isEmpty()) {
                    arr.set(i, pos.remove());
                } else if (!neg.isEmpty()) {
                    arr.set(i, neg.remove());
                }
            } else { // Odd index
                if (!neg.isEmpty()) {
                    arr.set(i, neg.remove());
                } else if (!pos.isEmpty()) {
                    arr.set(i, pos.remove());
                }
            }
        }
    }
}

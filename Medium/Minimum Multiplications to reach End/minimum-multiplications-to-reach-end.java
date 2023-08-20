//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int start = sc.nextInt();
            int end = sc.nextInt();

            Solution ob = new Solution();
            int ans = ob.minimumMultiplications(a, start, end);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Pair {
    int first, second;

    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

class Solution {
    int minimumMultiplications(int[] arr, int start, int end) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(start, 0));

        int[] dist = new int[100000];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;
        int mod = 100000;
        int n = arr.length;

        while (!q.isEmpty()) {
            int node = q.peek().first;
            int steps = q.peek().second;
            q.remove();

            for (int i = 0; i < n; i++) {
                int num = (int)(((long)arr[i] * node) % mod);

                if (steps + 1 < dist[num]) {
                    dist[num] = steps + 1;

                    if (num == end) return steps + 1;
                    q.add(new Pair(num, steps + 1));
                }
            }
        }
        
        if (dist[end] == Integer.MAX_VALUE) {
            return -1; // "end" number is unattainable
        }
        
        return dist[end];
    }
}

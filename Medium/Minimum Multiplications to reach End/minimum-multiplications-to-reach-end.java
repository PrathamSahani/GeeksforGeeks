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

class Solution {
    int minimumMultiplications(int[] arr, int start, int end) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        int[] dist = new int[100000];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;
        
        while (!q.isEmpty()) {
            int node = q.poll();
            
            for (int num : arr) {
                int nextNode = (int) (((long) num * node) % 100000);
                
                if (dist[nextNode] > dist[node] + 1) {
                    dist[nextNode] = dist[node] + 1;
                    q.add(nextNode);
                }
            }
        }
        
        return dist[end] == Integer.MAX_VALUE ? -1 : dist[end];
    }
}

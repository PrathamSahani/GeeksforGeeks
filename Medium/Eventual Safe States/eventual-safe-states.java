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
            int V = sc.nextInt();
            int E = sc.nextInt();

            List<List<Integer>> adj = new ArrayList<>();

            for (int i = 0; i < V; i++) {
                adj.add(new ArrayList<>());
            }
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();

                adj.get(u).add(v);
            }

            Solution obj = new Solution();
            List<Integer> safeNodes = obj.eventualSafeNodes(V, adj);
            for (int i : safeNodes) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    List<Integer> eventualSafeNodes(int V, List<List<Integer>> aj) {

        // Your code here
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0; i<V; i++){
            adj.add(new ArrayList<>());
        }
        int indgree[] = new int[V];
        for(int i=0; i<V; i++){
            for(int it: aj.get(i)){
                adj.get(it).add(i);
                indgree[i]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        List<Integer> safe = new ArrayList<>();
        for( int i=0; i<V; i++){
            if(indgree[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int node = q.peek();
            q.remove();
            safe.add(node);
            for(int it:adj.get(node)){
                indgree[it]--;
                if(indgree[it]==0)q.add(it);
            }
        }
        Collections.sort(safe);
        return safe;
    }
}

//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] S = br.readLine().trim().split(" ");
            int V = Integer.parseInt(S[0]);
            int E = Integer.parseInt(S[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for(int i = 0; i < V; i++){
                adj.add(new ArrayList<Integer>());
            }
            for(int i = 0; i < E; i++){
                String[] s = br.readLine().trim().split(" ");
                int u = Integer.parseInt(s[0]);
                int v = Integer.parseInt(s[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isBipartite(V, adj);
            if(ans)
                System.out.println("1");
            else System.out.println("0");
       }
    }
}
// } Driver Code Ends



class Solution {
    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] color = new int[V]; // Create an array to store colors (0 for uncolored, 1 for color A, -1 for color B).
        
        // Loop through each node in the graph.
        for (int node = 0; node < V; node++) {
            if (color[node] == 0) { // If the current node is uncolored, start BFS.
                Queue<Integer> queue = new LinkedList<>();
                queue.add(node); // Add the current node to the queue.
                color[node] = 1; // Color the current node with color A (1).

                while (!queue.isEmpty()) {
                    int current = queue.poll(); // Get the current node from the queue.
                    
                    // Loop through the neighbors of the current node.
                    for (int neighbor : adj.get(current)) {
                        // If the neighbor is uncolored, assign the opposite color and add it to the queue.
                        if (color[neighbor] == 0) {
                            color[neighbor] = -color[current];
                            queue.add(neighbor);
                        } else if (color[neighbor] == color[current]) {
                            // If the neighbor has the same color as the current node, the graph is not bipartite.
                            return false;
                        }
                    }
                }
            }
        }
        
        // If we've checked all nodes and there are no conflicts in coloring, the graph is bipartite.
        return true;
    }
}

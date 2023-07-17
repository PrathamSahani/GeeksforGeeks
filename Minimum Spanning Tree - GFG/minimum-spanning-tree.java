//{ Driver Code Starts


import java.util.*;
import java.io.*;
import java.lang.*;

public class Main{
	static BufferedReader br;
	static PrintWriter ot;
    public static void main(String args[]) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		ot = new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine().trim());
		while(t-- > 0){
			String s[] = br.readLine().trim().split(" ");
			int V = Integer.parseInt(s[0]);
			int E = Integer.parseInt(s[1]);
			int edges[][] = new int[E][3];
			for(int i = 0; i < E; i++){
				s = br.readLine().trim().split(" ");
				edges[i][0] = Integer.parseInt(s[0]);
				edges[i][1] = Integer.parseInt(s[1]);
				edges[i][2] = Integer.parseInt(s[2]);
			}
			ot.println(new Solution().spanningTree(V, E, edges));
		}
		ot.close();
	}
}
// } Driver Code Ends


// User function Template for Java
class Pair{
    int node;
    int distance;
    public Pair(int distance, int node){
        this.node = node;
        this.distance = distance;
    }
}

class Solution{
	static int spanningTree(int V, int E, int edges[][]){
	    // Code Here. 
	ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < E; i++) {
            int src = edges[i][0];
            int dest = edges[i][1];
            int weight = edges[i][2];

            adj.get(src).add(new ArrayList<>());
            adj.get(src).get(adj.get(src).size() - 1).add(dest);
            adj.get(src).get(adj.get(src).size() - 1).add(weight);

            adj.get(dest).add(new ArrayList<>());
            adj.get(dest).get(adj.get(dest).size() - 1).add(src);
            adj.get(dest).get(adj.get(dest).size() - 1).add(weight);
        }
        
	    PriorityQueue<Pair> pq = new PriorityQueue<Pair>((x, y)-> x.distance-y.distance);
	    int vis[] = new int[V];
	    pq.add(new Pair(0, 0));
	    int sum =0;
	    
	    while(!pq.isEmpty()){
	        int wt = pq.peek().distance;
	        int node = pq.peek().node;
	        pq.remove();
	        
	        if(vis[node]==1)continue;
	        
	        //add to in the mst;
	        vis[node] =1;
	        sum+=wt;
	        
	        for(int i=0; i<adj.get(node).size(); i++){
	            int edw = adj.get(node).get(i).get(1);
	            int adjNode = adj.get(node).get(i).get(0);
	            
	            if(vis[adjNode]==0){
	                pq.add(new Pair(edw, adjNode));
	            }
	        }
	    }
	    return sum;
	}
}
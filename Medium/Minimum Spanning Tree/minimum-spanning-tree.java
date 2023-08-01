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
    Pair(int node, int distance){
        this.node = node;
        this.distance = distance;
        
    }
}

class Solution{
	static int spanningTree(int V, int E, int edges[][]){
	    // Code Here. 
	    ArrayList<ArrayList<Pair>> adj =new ArrayList<>();
	    for(int i=0; i<V; i++){
	        adj.add(new ArrayList<>());
	    }
	    for(int i=0; i<E; i++){
	        int v = edges[i][0];
	        int u = edges[i][1];
	        int wt = edges[i][2];
	        adj.get(u).add(new Pair(v, wt));
	        adj.get(v).add(new Pair(u, wt));
	    }
	    PriorityQueue<Pair> pq = new PriorityQueue<>((x, y)-> x.distance-y.distance);
	    pq.add(new Pair(0, 0));
	    int vis[] = new int[V];
	    int sum =0;
	    while(!pq.isEmpty()){
	        Pair it = pq.peek();
	       
	        int node = it.node;

// User function Template for Java
class Pair{
    int node;
    int distance;
    Pair(int distance, int node){
        this.node = node;
        this.distance = distance;
    }
}
class Solution{
	static int spanningTree(int V, int E, int edges[][]){
	    // Code Here. 
	    ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
	    for(int i=0; i<V; i++){
	        adj.add(new ArrayList<>());
	    }
	    for(int i=0; i<E; i++)
	    {
	        int u = edges[i][0];
	        int v  = edges[i][1];
	        int wt = edges[i][2];
	        adj.get(u).add(new Pair(wt, v));
	        adj.get(v).add(new Pair(wt, u));
	    }
	    PriorityQueue<Pair> pq = new PriorityQueue<Pair>((x, y)-> x.distance-y.distance);
	    int[] vis = new int[V];
	    pq.add(new Pair(0,0));
	    int sum =0;
	    while(!pq.isEmpty()){
	        Pair it = pq.peek();
	        int wt = it.distance;
	        int node = it.node;
	        pq.remove();
	        if(vis[node]==1)continue;
	        vis[node]=1;
	        sum+=wt;
	        
	        for(Pair neigh: adj.get(node)){
	            int edw = neigh.distance;
	            int adjNode = neigh.node;
	            if(vis[adjNode]==0){
	                pq.add(new Pair(edw, adjNode));
	            }
	        }
	    }
	    return sum;
	}
}
	        int wt = it.distance;
	         pq.remove();
	        if(vis[node]==1)continue;
	        vis[node]=1;
	        sum+=wt;
	        for(Pair neigh: adj.get(node)){
	            int edW = neigh.distance;
	            int adjNode = neigh.node;
	            if(vis[adjNode]==0){
	                pq.add(new Pair(edW, adjNode));
	            }
	        }
	    }
	    return sum;
	}
}






















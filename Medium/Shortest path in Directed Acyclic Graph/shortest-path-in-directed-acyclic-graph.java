//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[][] edge = new int[m][3];
			for (int i = 0; i < m; i++) {
				edge[i][0] = sc.nextInt();
				edge[i][1] = sc.nextInt();
				edge[i][2] = sc.nextInt();
			}
			Solution obj = new Solution();
			int res[] = obj.shortestPath(n, m,edge);
			for (int i = 0; i < n; i++) {
				System.out.print(res[i] + " ");
			}
			System.out.println();
		}
	}
}
// } Driver Code Ends



class Pair{
    int first, second;
    Pair(int first, int second){
        this.first = first;
        this.second = second;
    }
}
//User function Template for Java
class Solution {

	public int[] shortestPath(int N,int M, int[][] edges) {
		//Code here\
		ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
		for(int i=0; i<N; i++){
		    adj.add(new ArrayList<>());
		}
		int ans[] = new int[N];
		for(int i=0; i<M; i++){
		    int u = edges[i][0];
		    int v = edges[i][1];
		    int wt = edges[i][2];
		    adj.get(u).add(new Pair(v, wt));
		    ans[v]++;
		}
		int dist[] = new int[N];
		Arrays.fill(dist, Integer.MAX_VALUE);
		dist[0] =0;
		Queue<Integer> q = new LinkedList<>();
		for(int i=0; i<N; i++){
		    if(ans[i]==0)
		    q.add(i);
		}
		while(!q.isEmpty()){
		    int node = q.poll();
		    for(Pair neighbor: adj.get(node)){
		        int v = neighbor.first;
		        int wt = neighbor.second;
		        
		        if(dist[node]!=Integer.MAX_VALUE && dist[node]+wt<dist[v]){
		            dist[v] = dist[node]+wt;
		        }
		        ans[v]--;
		        if(ans[v]==0){
		            q.add(v);
		        }
		    }
		}
		for(int i=0; i<N; i++){
		    if(dist[i]==Integer.MAX_VALUE)
		    dist[i] =-1;
		}
		return dist;

	}
}
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
            int n = Integer.parseInt(br.readLine().trim());
            String[] s = br.readLine().trim().split(" ");
            int[][] Intervals = new int[n][2];
            int j = 0;
            for(int i = 0; i < n; i++){
                Intervals[i][0] = Integer.parseInt(s[j]);
                j++;
                Intervals[i][1] = Integer.parseInt(s[j]);
                j++;
            }
            Solution obj = new Solution();
            int[][] ans = obj.overlappedInterval(Intervals);
            for(int i = 0; i < ans.length; i++){
                for(j = 0; j < ans[i].length; j++){
                    System.out.print(ans[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution
{
    public int[][] overlappedInterval(int[][] arr)
    {
        // Code here // Code here
        List<int[]> merge = new ArrayList<>();
        Arrays.sort(arr, (a,b)-> Integer.compare(a[0], b[0]));
        merge.add(new int[]{arr[0][0], arr[0][1]});
        for(int i=1; i<arr.length; i++){
            if(merge.get(merge.size()-1)[1]>=arr[i][0]){
                merge.get(merge.size()-1)[1] = Math.max(merge.get(merge.size()-1)[1], arr[i][1]);
            }else{
                merge.add(new int[]{arr[i][0], arr[i][1]});
            }
        }
        int res[][] = new int[merge.size()][2];
        for(int i=0; i<merge.size(); i++){
            res[i] = merge.get(i);
        }
        return res;
    }
}
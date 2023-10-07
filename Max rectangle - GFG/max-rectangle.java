//{ Driver Code Starts
import java.util.*;

class FindMinCost
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int arr[][] = new int[n][m];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println(new Solution().maxArea(arr, n, m));
		t--;
		}
	}
}
// } Driver Code Ends


/*Complete the function given below*/
class Solution {
    public static int swap(int arr[]){
        int max =0;
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<=arr.length; i++){
            while(!st.isEmpty() && (i==arr.length || arr[i]<=arr[st.peek()])){
                int height = arr[st.pop()];
                int width;
                if(st.isEmpty()){
                    width = i;
                }else{
                    width = i-st.peek()-1;
                }
                max = Math.max(max, height*width);
            }
            st.push(i);
            
        }
        return max;
    }
    public int maxArea(int M[][], int n, int m) {
        // add code here.
        int max =0;
        if(M==null || n==0 || m==0)return 0;
        int res[] = new int[m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(M[i][j]==1){
                    res[j]++;
                }else{
                    res[j]=0;
                }
            }
            max = Math.max(max, swap(res));
        }
        return max;
        
    }
}
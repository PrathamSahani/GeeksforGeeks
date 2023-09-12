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



class Solution {
    public int ans(int arr[]) {
        int max = 0;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i <= arr.length; i++) {
            while (!st.isEmpty() && (i == arr.length || arr[i] <= arr[st.peek()])) {
                int height = arr[st.pop()];
                int width;
                if (st.isEmpty()) {
                    width = i;
                } else {
                    width = i - st.peek() - 1;
                }
                max = Math.max(max, height * width);
            }
            st.push(i);
        }
        return max;
    }

    public int maxArea(int M[][], int n, int m) {
        if (M.length == 0 || M[0].length == 0)
            return 0;
        int row = M.length;
        int col = M[0].length;
        int max = 0;
        int hist[] = new int[col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (M[i][j] == 1) {
                    hist[j]++;
                } else {
                    hist[j] = 0;
                }
            }
            max = Math.max(max, ans(hist));
        }
        return max;
    }
}

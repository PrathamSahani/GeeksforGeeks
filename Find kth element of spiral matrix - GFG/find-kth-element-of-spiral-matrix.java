//{ Driver Code Starts
import java.util.*;

class Find_Given_Element_Of_Spiral_Matrix 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
			int arr[][] = new int[1000][1000];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println(new Solution().findK(arr, n, m, k));
		t--;
		}
	}
}
// } Driver Code Ends

class Solution
{
    /*You are required to complete this method*/
    int findK(int A[][], int n, int m, int k)
    {
// Your code here
    int tr = 0;
        int br = n-1;
        int lc =0;
        int rc = m-1;
        int count =0;
        while(n*m > count){
            for(int i = lc ; i <= rc ; i++){
                if(tr > br){
                    break;
                }
                count++;
                if(count == k){
                    return A[tr][i];
                }
            }
            tr++;
            for(int i = tr ; i <= br ; i++){
                if(lc > rc){
                    break;
                }
                count++;
                if(count == k){
                    return A[i][rc];
                }
            }
            rc--;
            for(int i = rc ; i >= lc ; i--){
                if(tr > br){
                    break;
                }
                count++;
                if(count == k){
                    return A[br][i];
                }
            }
            br--;
            for(int i = br ; i >= tr ; i--){
                if(lc > rc){
                    break;
                }
                count++;
                if(count == k){
                    return A[i][lc];
                }
            }
            lc++;
        }
        return -1;
    }
}
//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int h = sc.nextInt();
            Solution obj = new Solution();
            int ans = obj.Solve(n,a,h);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int f(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            max = Math.max(max, arr[i]);
        }
        return max;
    }
    public static int f(int arr[], int hour){
        int ans =0;
        for(int i=0; i<arr.length; i++){
            ans += (int)Math.ceil((double)arr[i]/(double)hour);
        }
        return ans;
    }
    public static int Solve(int N, int[] piles, int H) {
        // code here
        int low =0, high = f(piles);
        while(low<=high){
            int mid = (low+high)/2;
            int ans = f(piles, mid);
            if(ans<=H){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
}
        

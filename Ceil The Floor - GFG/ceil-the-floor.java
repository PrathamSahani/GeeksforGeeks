//{ Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            Pair ans = new Solve().getFloorAndCeil(arr, n, x);
            System.out.println(ans.floor + " " + ans.ceil);
        }
    }
}

class Pair {
    int floor, ceil;

    Pair() {
        this.floor = 0;
        this.ceil = 0;
    }

    Pair(int floor, int ceil) {
        this.floor = floor;
        this.ceil = ceil;
    }
}

// } Driver Code Ends


//User function Template for Java




class Solve {
    static int floor(int arr[], int n, int x){
        int low =0;
        int high = n-1;
        int ans =-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]<=x){
                ans = arr[mid];
                low = mid+1;
            }else{
                high = mid-1;
            }
            }
            return ans;
        }
        static int ceil(int arr[], int n, int x){
            int low = 0;int high = n-1;
            int ans = -1;
            while(low<=high){
                int mid = low+(high-low)/2;
                if(arr[mid]>=x){
                    ans = arr[mid];
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }
            return ans;
        }
    Pair getFloorAndCeil(int[] arr, int n, int x) {
        // code here
        Arrays.sort(arr);
        return new Pair(floor(arr,n, x), ceil(arr, n, x));
   
    }
}


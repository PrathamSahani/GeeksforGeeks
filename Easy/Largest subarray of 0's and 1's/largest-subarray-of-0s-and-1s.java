//{ Driver Code Starts
import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.util.HashMap;

class Largest_Subarray
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int N = sc.nextInt();
            int a[] = new int[N];
            for (int i = 0; i < N; i++) 
                a[i] = sc.nextInt();
            

            Solution g = new Solution();
            int n = g.maxLen(a, a.length);

            System.out.println(n);

            T--;
        }
    }
}

// } Driver Code Ends




class Solution {

    // arr[] : the input array containing 0s and 1s
    // N : size of the input array
    
    // return the maximum length of the subarray
    // with equal 0s and 1s
    int maxLen(int[] arr, int N)
    {
        // Your code here
      if(arr.length==0)return 0;
      for(int i=0; i<N; i++){
          if(arr[i]==0){
              arr[i] =-1;
          }
      }
      HashMap<Integer, Integer> mp = new HashMap<>();
      int max =0;
      int sum =0;
      mp.put(0, -1);
       for(int i=0; i<arr.length; i++){
           sum+=arr[i];
           if(mp.containsKey(sum)){
               max = Math.max(max, i-mp.get(sum));
           }
           if(!mp.containsKey(sum)){
               mp.put(sum, i);
           }
       }
       return max;
      
      
    }
}

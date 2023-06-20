//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(a[i]);
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.nextPermutation(N, arr);
            StringBuilder out = new StringBuilder();
            for(int i = 0;i < N;i++)
                out.append(ans.get(i) + " ");
            System.out.println(out);
        }
    }
}
// } Driver Code Ends



// User function Template for Java

class Solution{
    static List<Integer> nextPermutation(int n, int arr[])
    {
      List<Integer> ans=new ArrayList<>();
      //first find the breakpoint
      int pivot=-1;
      for(int i=n-2;i>=0;i--)
      {
        if(arr[i]<arr[i+1])
        {
            pivot=i;
            break;
        }
      }
      //if break point does not exist
      if(pivot==-1)
      {
          reverse(arr,0,n-1);
          for(int i=0;i<arr.length;i++)
         {
          ans.add(arr[i]);
         }
         return ans; 
         
      }
      //second find the next greater element and swap it with arr[breakpoint]
      for(int i=n-1;i>pivot;i--)
      {
          if(arr[i]>arr[pivot])
          {
              int temp=arr[i];
              arr[i]=arr[pivot];
              arr[pivot]=temp;
              break;
          }
      }
      //reverse the right half
      reverse(arr,pivot+1,n-1);
      for(int i=0;i<arr.length;i++)
      {
          ans.add(arr[i]);
      }
      return ans;
    }
    public static void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void reverse(int arr[],int i,int j)
    {
        while(i<j)
        {
            swap(arr,i++,j--);
        }
    }
}
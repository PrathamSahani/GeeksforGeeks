//{ Driver Code Starts
//Initial Template for Java

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
            String s = br.readLine();
            String[] S = s.split(" ");
            int[] v = new int[2 * n + 2];
            for(int i = 0; i < 2 * n + 2; i++)
            {
                v[i] = Integer.parseInt(S[i]);
            }
            Solution ob = new Solution();
            int[] ans = ob.singleNumber(v);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}


// } Driver Code Ends



class Solution {
    public int[] singleNumber(int[] nums) {
          ArrayList<Integer> list = new ArrayList<>();
          int i=0;
          Arrays.sort(nums);
          while(i<nums.length){
              if(i+1<nums.length && nums[i+1]==nums[i]){
                  i+=2;
              }else{
                  list.add(nums[i]);
                  i++;
              }
          }
          int res[] = new int[list.size()];
          for(i=0; i<list.size(); i++){
              res[i]= list.get(i);
          }
          return res;
    }
}

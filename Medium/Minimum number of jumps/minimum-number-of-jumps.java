//{ Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	 
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int t = Integer.parseInt(br.readLine()); 

        while(t-- > 0){
            int size = Integer.parseInt(br.readLine());
            String[] arrStr = ((String)br.readLine()).split("\\s+");
            int[] arr= new int[size];
            for(int i = 0;i<size;i++){
                arr[i] = Integer.parseInt(arrStr[i]);
            }
            System.out.println(new Solution().minJumps(arr));
        }
	 }
	 
}

// } Driver Code Ends



class Solution{
    
      int minJumps(int arr[]) {
         int range =0, jumps =0, curr =0;
         for(int i=0; i<arr.length-1; i++){
             range = Math.max(range, arr[i]+i);
             if(curr==i){
                 curr = range;
                 jumps++;
             }
         }
         if(curr<arr.length-1)return -1;
         return jumps;
       
  
    }}
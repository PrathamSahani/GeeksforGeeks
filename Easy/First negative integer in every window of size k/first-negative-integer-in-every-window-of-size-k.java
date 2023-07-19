//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            int k = Integer.parseInt(br.readLine().trim());
            
            Compute obj = new Compute();
            long answer[] = obj.printFirstNegativeInteger(a, n, k);
            int sz = answer.length;
            
            StringBuilder output = new StringBuilder();
            for(int i=0;i<sz;i++)
                output.append(answer[i]+" ");
            System.out.println(output);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Compute {
    
    public long[] printFirstNegativeInteger(long nums[], int N, int K)
    {
         long res[] = new long[nums.length - K + 1];
        int ans = 0;
        Deque<Integer> q = new ArrayDeque<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (!q.isEmpty() && q.peek() == i - K) {
                q.poll();
            }
            while (!q.isEmpty() && nums[q.peekFirst()] >= 0) {
                q.pollFirst();
            }
            q.add(i);
            
            if (i >= K - 1) {
                if (!q.isEmpty() && nums[q.peek()] < 0) {
                    res[ans++] = nums[q.peek()];
                } else {
                    res[ans++] = 0;
                }
            }
        }
        
        return res;
        
    }
}
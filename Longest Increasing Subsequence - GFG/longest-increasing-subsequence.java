//{ Driver Code Starts
import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        
        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);
        
        //taking total testcases
        int t = sc.nextInt();
        while(t > 0){
            
            //taking size of array
            int n = sc.nextInt();
            int array[] = new int[n];
            
            //inserting elements in the array
            for (int i = 0; i < n; ++i)
            {
                array[i] = sc.nextInt();
            }
            
            //creating an object of class Solution
            Solution ob = new Solution();
            
            //calling longestSubsequence() method of class
            //Solution
            System.out.println(ob.longestSubsequence(n,array));
            t--;
        }
    } 
} 
// } Driver Code Ends



 
class Solution 
{
    
    
    public static int lowerBound(List<Integer> arr, int target) {
        int left = 0;
        int right = arr.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr.get(mid) >= target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
    //Function to find length of longest increasing subsequence.
    static int longestSubsequence(int size, int nums[]){
    
    List<Integer> ans = new ArrayList<>();

        ans.add(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > ans.get(ans.size() - 1)) {
                ans.add(nums[i]);
            } else {
                int index = lowerBound(ans, nums[i]);
                ans.set(index, nums[i]);
            }
        }

        return ans.size();
  
    } 
} 
// } Driver Code Ends
//{ Driver Code Starts
//Initial Template for Java



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String str = br.readLine().trim();

            String ans = new Solution().removeDuplicates(str);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends




class Solution {
    String removeDuplicates(String str) {
        Set<Character> set = new LinkedHashSet<>(); // Using LinkedHashSet to maintain order
        
        // Iterate through the characters of the string and add to the set
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        
        // Reconstruct the string without duplicates
        StringBuilder result = new StringBuilder();
        for (char ch : set) {
            result.append(ch);
        }
        
        return result.toString();
    }
}



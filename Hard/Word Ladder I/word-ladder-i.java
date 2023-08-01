//{ Driver Code Starts
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
            String[] wordList = new String[n];
            for(int i = 0; i < n; i++){
                wordList[i] = br.readLine().trim();
            }
            String startWord, targetWord;
            startWord = br.readLine().trim();
            targetWord = br.readLine().trim();
            Solution obj = new Solution();
            int ans = obj.wordLadderLength(startWord, targetWord, wordList);
            System.out.println(ans);
       }
    }
}

// } Driver Code Ends




class Solution {
    public int wordLadderLength(String startWord, String targetWord, String[] wordList) {
        Set<String> wordSet = new HashSet<>(Arrays.asList(wordList));
        if (!wordSet.contains(targetWord)) {
            return 0; // Target word must be in the wordList
        }
        
        Queue<String> queue = new LinkedList<>();
        queue.offer(startWord);
        int level = 1; // To track the number of transformations
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String currentWord = queue.poll();
                
                // Check if the currentWord can be transformed to the targetWord
                if (currentWord.equals(targetWord)) {
                    return level;
                }
                
                char[] charArray = currentWord.toCharArray();
                for (int j = 0; j < charArray.length; j++) {
                    char originalChar = charArray[j];
                    for (char c = 'a'; c <= 'z'; c++) {
                        if (c != originalChar) {
                            charArray[j] = c;
                            String transformedWord = new String(charArray);
                            if (wordSet.contains(transformedWord)) {
                                queue.offer(transformedWord);
                                wordSet.remove(transformedWord); // Mark as visited
                            }
                        }
                    }
                    charArray[j] = originalChar; // Restore the original character
                }
            }
            level++; // Increment the transformation level after processing each level
        }
        
        return 0; // If no transformation sequence is found
    }
}

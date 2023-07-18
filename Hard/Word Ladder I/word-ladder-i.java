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


class Pair{
    String first;
    int second;
    Pair(String first, int second){
        this.first = first;
        this.second = second;
    }
}

class Solution
{
    
    public int wordLadderLength(String start, String target, String[] wordList)
    {
        // Code here
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(start, 1));
        HashSet<String> set =new HashSet<>();
        for(int i=0; i<len; i++){
    set.add(wordList[i]);
}
        
        set.remove(start);
        while(!q.isEmpty()){
            String word = q.peek().first;
            int steps = q.peek().second;
            q.remove();
            if(word.equals(target)==true){
                return steps;
            }
            for(int i=0; i<word.length(); i++){
                for(char ch='a'; ch<='z'; ch++){
                    char replace[] = word.toCharArray();
                    replace[i] = ch;
                    String replaced = new String(replace);
                    if(set.contains(replaced)){
                        set.remove(replaced);
                        q.add(new Pair(replaced, steps+1));
                    }
                }
            }
        }
        return 0;
    }
}
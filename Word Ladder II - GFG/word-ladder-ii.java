//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class comp implements Comparator<ArrayList<String>> {
    // override the compare() method
    public int compare(ArrayList<String> a, ArrayList<String> b)
    {
        String x = "";
        String y = "";
        for(int i=0; i<a.size(); i++)
            x += a.get(i);
        for(int i=0; i<b.size(); i++)
            y += b.get(i);
        return x.compareTo(y);
    }
}

public class GFG
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
            ArrayList<ArrayList<String>> ans = obj.findSequences(startWord, targetWord, wordList);
            if(ans.size()==0)
                System.out.println(-1);
            else
            {
                Collections.sort(ans, new comp());
                for(int i=0; i<ans.size(); i++)
                {
                    for(int j=0; j<ans.get(i).size(); j++)
                    {
                        System.out.print(ans.get(i).get(j) + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
// } Driver Code Ends



//User function Template for Java
class Pair{
    ArrayList<String>s;
    int level;
    public Pair(ArrayList<String>s,int l){
        this.s=s;
        this.level=l;
    }
}
class Solution
{
    public ArrayList<ArrayList<String>> findSequences(String startWord, String targetWord, String[] wordList)
    {
        // Code here
        Set<String>st=new HashSet<>();
        for(int i=0;i<wordList.length;i++){
            st.add(wordList[i]);
        }
        Queue<Pair>q=new LinkedList<>();
        ArrayList<String>s=new ArrayList<>();
        s.add(startWord);
        q.add(new Pair(s,1));
        
       
        ArrayList<ArrayList<String>>ans=new ArrayList<>();
        while(!q.isEmpty()){
            Pair p=q.poll();
            ArrayList<String>temp=p.s;
            
            String str=temp.get(temp.size()-1);
            if(str.equals(targetWord)){
                if(ans.size()==0)ans.add(temp);
                else if(ans.get(0).size()==temp.size())ans.add(temp);
            }
            st.remove(str);
            for(int i=0;i<str.length();i++){
                for(char ch='a';ch<='z';ch++){
                    char[]c=str.toCharArray();
                    c[i]=ch;
                    String x=new String(c);
                    if(st.contains(x)){
                        ArrayList<String>al=new ArrayList<>(temp);
                        al.add(x);
                        q.add(new Pair(al,p.level+1));
                    }
                }
            }
        }
        return ans;
    }
    
}









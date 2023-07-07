//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                out.print(ans.get(i)+" ");
            }
            out.println();
                        
        }
        out.close();
	}
}


// } Driver Code Ends


class Solution {
    static String swap(String s, int l, int r){
        char ch[] = s.toCharArray();
        char temp = ch[l];
        ch[l] = ch[r];
        ch[r] = temp;
        String ans = new String(ch);
        return ans;
    }
   static void permutation(String s, int l, int h, Set<String> set){
       if(l==h){
           set.add(s);
           return;
       }
       for(int i=l; i<=h; i++){
            s = swap(s, l, i);
             permutation(s, l+1, h, set);
             s = swap(s, l, i);
           
       }
   }
    public List<String> find_permutation(String S) {
        // Code here
        Set<String> set = new HashSet<>();
        permutation(S, 0, S.length()-1, set);
        List<String> ans = new ArrayList<>(set);
        Collections.sort(ans);
        return ans;
    }
}

















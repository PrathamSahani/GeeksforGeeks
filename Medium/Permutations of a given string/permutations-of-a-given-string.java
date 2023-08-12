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
    public static String swap(String ans, int l, int r){
        char ch[] = ans.toCharArray();
        char temp = ch[l];
        ch[l] = ch[r];
        ch[r] = temp;
        String a = new String(ch);
        return a;
    }
    public static void find(String str, int l, int h, Set<String> set){
        if(l==h){
            set.add(str);
            return;
        }
        for(int i=l; i<=h; i++){
            str = swap(str, l, i);
            find(str, l+1, h, set);
            str = swap(str, l, i);
        }
    }
    public List<String> find_permutation(String S) {
        // Code here
        HashSet<String> set = new HashSet<>();
        find(S, 0, S.length()-1, set);
        List<String> list = new ArrayList<>(set);
        Collections.sort(list);
        return list;
    }
}
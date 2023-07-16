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
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String A = br.readLine().trim();
            Solution ob = new Solution();
            String ans = ob.FirstNonRepeating(A);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends

class Solution

{

    public String FirstNonRepeating(String A)

    {

        // code here

        

        int arr[]=new int[26];

        int j=0;

        char []s=A.toCharArray();

        StringBuilder sb=new StringBuilder();

        for(int i=0;i<s.length;i++){

            char ch=s[i];

            arr[ch-'a']++;

            if(arr[s[j]-'a']==1){

                sb.append(s[j]);

            }else{

                while(j<=i && arr[s[j]-'a']!=1){

                    j++;

                }

                if(j>i){

                    sb.append('#');

                }else{

                    sb.append(s[j]);

                }

            }

        }

        return sb.toString();

    }

}
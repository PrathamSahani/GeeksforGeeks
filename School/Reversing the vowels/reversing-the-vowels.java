//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s;
            s = sc.next();
           
            Solution ob = new Solution();
            
            System.out.println(ob.modify(s));    
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    String modify (String s)
    {
        // your code here]
        ArrayList<Character> vow = new ArrayList<>();
        ArrayList<Integer> pos= new ArrayList<>();
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch=='e' || ch=='a' || ch=='i' || ch=='o' || ch=='u' || ch=='E' || ch=='A' || ch=='I'|| ch=='O' || ch=='U'){
                vow.add(ch);
                pos.add(i);
            }
        }
        Collections.reverse(vow);
        char ch[] =s.toCharArray();
        for(int i=0; i<pos.size(); i++){
            ch[pos.get(i)] = vow.get(i);
        }
        return new String(ch);
    }
}
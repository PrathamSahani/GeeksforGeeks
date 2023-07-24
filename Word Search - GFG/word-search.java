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
            String[] S = br.readLine().trim().split(" ");
            int n = Integer.parseInt(S[0]);
            int m = Integer.parseInt(S[1]);
            char [][] board = new char[n][m];
            for(int i = 0; i < n; i++){
                String[] s = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++){
                    board[i][j] = s[j].charAt(0);
                }
            }
            String word = br.readLine().trim();
            Solution obj = new Solution();
            boolean ans = obj.isWordExist(board, word);
            if(ans)
                System.out.println("1");
            else
                System.out.println("0");
       }
    }
}
// } Driver Code Ends


class Solution
{
    public boolean isWordExist(char[][] board, String word)
    {
        // Code here
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(board[i][j]==word.charAt(0) && solve(board, i, j, word, 0))
                return true;
            }
        }
        return false ;
    }
    private boolean solve(char[][] board, int row, int col, String word, int idx){
        if(idx==word.length())
        return true;
        if(row<0 || row>=board.length || col<0 || col>=board[0].length || board[row][col]!=word.charAt(idx)){
            return false;
        }
        char ch= board[row][col];
        board[row][col] = '-';
        boolean found = solve(board, row + 1, col, word, idx + 1) ||
                        solve(board, row - 1, col, word, idx + 1) ||
                        solve(board, row, col + 1, word, idx + 1) ||
                        solve(board, row, col - 1, word, idx + 1);
        
        board[row][col]= ch;
        return found;
    }
}
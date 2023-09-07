//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-->0){
            String s1[] = in.readLine().trim().split("\\s+");
            int mat[][] = new int[9][9];
            for(int i = 0;i < 81;i++)
                mat[i/9][i%9] = Integer.parseInt(s1[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.isValid(mat));
        }
    }
}
// } Driver Code Ends


class Solution {
    public static boolean valid(int mat[][], int i, int j, int ch) {
        for (int k = 0; k < 9; k++) {
            if (mat[i][k] == ch)
                return false;

            if (mat[k][j] == ch)
                return false;

            if (mat[3 * (i / 3) + k / 3][3 * (j / 3) + k % 3] == ch)
                return false;
        }
        return true;
    }

    static int isValid(int mat[][]) {
        // code here
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (mat[i][j] != 0) {
                    int num = mat[i][j];
                    mat[i][j] = 0; // Temporarily remove the number for validation
                    if (!valid(mat, i, j, num)) {
                        return 0; // Invalid Sudoku
                    }
                    mat[i][j] = num; // Restore the number
                }
            }
        }
        return 1; // Valid Sudoku
    }
}

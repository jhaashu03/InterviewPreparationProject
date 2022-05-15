//Lecture - 8

package MyProjects.DP.LongestCommonSubsequence;

import MyProjects.DP.LongestCommonSubsequence.LCS;

public class LongestPalindromicSubsequence {
    public static void main(String[] args) {
        String s = "GEEKSFORGEEKS";
        StringBuffer srev = new StringBuffer(s);
        srev.reverse();
        int n = s.length();
        System.out.printf("The length of the LPS is %d", lps(s.toCharArray(),srev.toString().toCharArray(),n));

    }

    public static int lps(char[] c1, char[] c2, int n) {
        int[][] t = new int[n+1][n+1];

        //LCS
        for(int i=0;i<n+1;i++){
            for(int j=0;j<n+1;j++){
                if(i==0||j==0){
                    t[i][j] = 0;
                }
                else if(c1[i-1]==c2[j-1]){
                    t[i][j] = 1+t[i-1][j-1];
                }
                else
                    t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
            }
        }
         for(int i=0;i<n+1;i++){
                for(int j=0;j<n+1;j++)
                    System.out.print(t[i][j]+" ");
                System.out.println();
            }
        return t[n][n];
        //return LCS.LSCDP(c1,c2,n,n);
    }
}

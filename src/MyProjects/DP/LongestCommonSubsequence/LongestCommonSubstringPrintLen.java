//Lecture-2

package MyProjects.DP.LongestCommonSubsequence;

public class LongestCommonSubstringPrintLen {
    public static void main(String[] args)
    {
        int n, m;
        String X = "abcdxyz";
        String Y = "xyzabcd";

        n = X.length();
        m = Y.length();

        System.out.println(lcs(X.toCharArray(), Y.toCharArray(), n, m));
    }

    public static int lcs(char[] c1, char[] c2, int n, int m) {
        int[][] t = new int[n+1][m+1];
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n+1;i++)
            t[i][0] = 0;
        for(int i=0;i<m+1;i++)
            t[0][i] = 0;

        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(c1[i-1] == c2[j-1]){
                    t[i][j] = 1 + t[i-1][j-1];
                    //print max in the matrix
                    max= Math.max(max,t[i][j]);
                }
                else
                    t[i][j] = 0;
            }
        }

        return max;
    }
}

//Lecture-1

package MyProjects.DP.LongestCommonSubsequence;

public class LCS {
    public static void main(String args[]){
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        System.out.println(LSCRecursive(s1,s2,s1.length(),s2.length()));
        System.out.println(LSCMemorization(s1,s2,s1.length(),s2.length()));
        System.out.println(LSCDP(c1,c2,s1.length(),s2.length()));

    }

    //Recursion
    private static int LSCRecursive(String s1, String s2, int n, int m) {
        if(n==0||m==0)
            return 0;
        if(s1.charAt(n-1)==s2.charAt(m-1))
            return 1+ LSCRecursive(s1,s2,n-1,m-1);
        else
            return Math.max(LSCRecursive(s1,s2,n-1,m),LSCRecursive(s1,s2,n,m-1));
    }

    //Memorization
    private static int LSCMemorization(String s1, String s2, int n, int m) {
        int[][] t = new int[n+1][m+1];
        for(int i=0;i<n+1;i++)
            for(int j=0;j<m+1;j++)
                t[i][j] = -1;

        if(n==0||m==0)
            return 0;

        if(t[n][m]!=-1)
            return t[n][m];

        if(s1.charAt(n-1)==s2.charAt(m-1))
            return t[n][m] = 1 + LSCRecursive(s1,s2,n-1,m-1);
        else
            return t[n][m] =  Math.max(LSCRecursive(s1,s2,n-1,m),LSCRecursive(s1,s2,n,m-1));
    }

    //Dynamic Programming
    public static int LSCDP(char[] c1, char[] c2, int n, int m) {
        int[][] t = new int[n+1][m+1];
        for(int i=0;i<n+1;i++)
            t[i][0] = 0;
        for(int i=0;i<m+1;i++)
            t[0][i] = 0;
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(c1[i-1] == c2[j-1])
                    t[i][j] = 1 + t[i-1][j-1];
                else
                    t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
            }
        }

       return t[n][m];
    }
}

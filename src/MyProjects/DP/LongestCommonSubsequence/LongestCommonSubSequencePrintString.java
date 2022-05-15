//Lecture - 3

package MyProjects.DP.LongestCommonSubsequence;

public class LongestCommonSubSequencePrintString {
    public static void main(String[] args)
    {
        int n, m;
        String X = "abcbcf";
        String Y = "abcdaf";

        n = X.length();
        m = Y.length();

        System.out.println(lcsString(X.toCharArray(), Y.toCharArray(), n, m));
    }
    private static StringBuffer lcsString(char[] c1, char[] c2, int n, int m) {
        StringBuffer ans = new StringBuffer();
        int[][] t = new int[n+1][m+1];
        for(int i=0; i<n+1; i++){
            for(int j=0; j<m+1; j++){
                if(i==0 || j==0){
                    t[i][j] = 0;
                }
                else if(c1[i-1]==c2[j-1])
                    t[i][j] = 1 + t[i-1][j-1];
                else
                    t[i][j] = Math.max(t[i-1][j] , t[i][j-1]);
            }
        }
        for(int i=0;i<n+1;i++){
                for(int j=0;j<m+1;j++)
                    System.out.print(t[i][j]+" ");
                System.out.println();
            }
        int i = n ; int j = m;

        while(i>0 && j>0){
            if(c1[i-1] == c2[j-1]){
                ans.append(c1[i-1]);
                i--;
                j--;
            }
            else{
                if(t[i-1][j]>t[i][j-1])
                    i--;
                else
                    j--;
            }
        }
        return ans.reverse();
    }
}

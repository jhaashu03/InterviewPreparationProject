//https://www.geeksforgeeks.org/longest-common-subsequence-dp-4/
//https://www.youtube.com/watch?v=sSno9rV8Rhg

package MyProjects.DP;

public class LongestCommonSubsequenceOld {
    public static void main(String args[]){
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        System.out.println(LSC(c1,c2,s1.length(),s2.length()));

    }

    private static int LSC(char[] c1, char[] c2, int n, int m) {
        int[][] table = new int[n+1][m+1];
        for(int i =0;i<=n;i++){
            for(int j=0;j<=m;j++){
                if(i==0||j==0){
                    table[i][j] = 0;
                }
                else{
                    if(c1[i-1] == c2[j-1]){
                        table[i][j] = 1+table[i-1][j-1];
                    }
                    else{
                        table[i][j] = Math.max(table[i-1][j],table[i][j-1]);
                    }
                }
            }
        }
        return table[n][m];
    }
}

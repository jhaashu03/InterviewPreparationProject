package MyProjects.DP.LongestCommonSubsequence;

public class LongestRepeatingSubsequence {
    public static void main(String args[])
    {
        //String str = "AABEBCDD";
        String str = "geeksforgeeks";
        System.out.println(str.length());
        System.out.println(longestRepeatedSubSeq(str,str.length()));
    }

    private static int longestRepeatedSubSeq(String str, int n) {
        int[][] t = new int[n+1][n+1];

        for(int i=0;i<n+1;i++){
            for(int j=0;j<n+1;j++){
                if(i==0||j==0)
                    t[i][j] =0;
                else if(str.charAt(i-1)==str.charAt(j-1)&&i!=j)
                    t[i][j] = 1 + t[i-1][j-1];
                else
                    t[i][j] = Math.max(t[i-1][j] , t[i][j-1]);
            }
        }
        /*for(int i=0;i<n+1;i++){
            for(int j=0;j<n+1;j++){
                System.out.print(t[i][j]+" ");
            }
            System.out.println();
        }*/
        return t[n][n];
    }
}

//Lecture - 5


/*Input:   str1 = "geek",  str2 = "eke"
Output: 5
Explanation:
String "geeke" has both string "geek"
and "eke" as subsequences.

Input:   str1 = "AGGTAB",  str2 = "GXTXAYB"
Output:  9
Explanation:
String "AGXGTXAYB" has both string
"AGGTAB" and "GXTXAYB" as subsequences.*/

package MyProjects.DP.LongestCommonSubsequence;

public class ShortestCommonSuperSequenceLen {
    public static void main(String args[])
    {
        String X = "AGGTAB";
        String Y = "GXTXAYB";
        System.out.println("Length of the shortest supersequence is: " + superSeq(X, Y, X.length(), Y.length()));
    }

    private static int superSeq(String x, String y, int n, int m) {
        int lenLCS = LCS.LSCDP(x.toCharArray(),y.toCharArray(),n,m);
        //length of String X + Length of String Y - LCS of String x & Y
        return n+m-lenLCS;
    }
}

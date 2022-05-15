//Lecture-5
//Minimum number of deletions and insertions to transform one string into another
//https://www.geeksforgeeks.org/minimum-number-deletions-insertions-transform-one-string-another/


package MyProjects.DP.LongestCommonSubsequence;


public class MinimumNumberOfDeletionsAndInsertions {
    public static void main(String[] args)
    {
        String str1 = "heap";
        String str2 = "pea";

        System.out.println(printMinDelAndInsert(str1, str2,str1.length(),str2.length()));
    }

    private static int printMinDelAndInsert(String str1, String str2, int n, int m) {
        int lcs = LCS.LSCDP(str1.toCharArray(),str2.toCharArray(),n,m);

        int deletion = n-lcs;
        int insertion = m-lcs;

        return deletion+insertion;
    }
}

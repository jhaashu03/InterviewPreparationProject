package MyProjects.DP.LongestCommonSubsequence;

public class LongestPalindromicSubstring {
    public static void main(String[] args)
    {
        String str = "forgeeksskeegfor";
        StringBuffer strRev = new StringBuffer(str);
        strRev.reverse();
        //System.out.println(str );
        //System.out.println(strRev );
        System.out.print("\nLongest Palindromic Substring is: " + longestPalSubstr(str.toCharArray(),
                strRev.toString().toCharArray()
                ,str.length()));
    }

    private static StringBuffer longestPalSubstr(char[] c1, char[] c2, int n) {
        return LongestCommonSubstringPrintString.lcsString(c1,c2,n,n);
    }
}

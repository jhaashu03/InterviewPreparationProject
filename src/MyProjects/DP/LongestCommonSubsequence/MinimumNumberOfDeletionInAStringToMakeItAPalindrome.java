//Lecture -8
//https://www.geeksforgeeks.org/minimum-number-deletions-make-string-palindrome/
/*Input : aebcbda
Output : 2
Remove characters 'e' and 'd'
Resultant string will be 'abcba'
which is a palindromic string

Input : geeksforgeeks
Output : 8*/

package MyProjects.DP.LongestCommonSubsequence;

public class MinimumNumberOfDeletionInAStringToMakeItAPalindrome {
    public static void main(String[] args)
    {
        String str = "geeksforgeeks";
        System.out.println("Minimum number " +
                "of deletions = "+
                minimumNumberOfDeletions(str));
    }

    private static int minimumNumberOfDeletions(String str) {
        int n = str.length();
        StringBuffer strRev = new StringBuffer(str);
        strRev.reverse();
        return n-LongestPalindromicSubsequence.lps(str.toCharArray(),
                strRev.toString().toCharArray(),n);
    }
}

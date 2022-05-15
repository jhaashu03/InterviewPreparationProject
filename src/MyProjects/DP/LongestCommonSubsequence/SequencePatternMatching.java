package MyProjects.DP.LongestCommonSubsequence;

//check if s2 contain s1 squence or not is similar to computing LCS which len should be s1
public class SequencePatternMatching {
    public static void main(String args[]){
        String s1 = "AXY";
        String s2 = "ADXCPY";
        System.out.println(matching(s1,s2,s1.length(),s2.length()));
    }

    private static boolean matching(String s1, String s2, int n, int m) {
        int minLen = Math.min(n,m);
        return LCS.LSCDP(s1.toCharArray(),s2.toCharArray(),n,m) == minLen;
    }


}

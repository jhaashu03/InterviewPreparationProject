package MyProjects.DP.MatrixChainMultiplication;

import java.util.Arrays;

public class PalindromePartitioning {
    static int[][] t = new int[100][100];
    public static void main(String args[])
    {
        String str = "ababbbabbababa";
        System.out.println("Min cuts needed for "
                + "Palindrome Partitioning is Recursive way " +
                    minPalPartionRecursion(str, 0, str.length() - 1));

        System.out.println("Min cuts needed for "
                + "Palindrome Partitioning is Memorization way " +
                minPalPartionMemorization(str, 0, str.length() - 1));

        System.out.println("Min cuts needed for "
                + "Palindrome Partitioning is DP way " +
                minPalPartionDP(str, 0, str.length() - 1));
    }

    //Recursion
    private static int minPalPartionRecursion(String str, int i, int j) {
        if(i>=j)
            return 0;
        if(isPalindrome(str.substring(i,j+1)))
            return 0;
        int ans = Integer.MAX_VALUE, count;
        for(int k =i;k<=j-1;k++){
            count=minPalPartionRecursion(str,i,k) + minPalPartionRecursion(str,k+1,j) + 1;
            ans=Math.min(ans,count);
        }
        return ans;
    }

    //Memorization
    private static int minPalPartionMemorization(String str, int i, int j) {
        for(int[] row : t)
            Arrays.fill(row,-1);
        if(i>=j)
            return 0;
        if(isPalindrome(str.substring(i,j+1)))
            return 0;
        if(t[i][j]!=-1)
            return t[i][j];

        int ans = Integer.MAX_VALUE, count;
        for(int k =i;k<=j-1;k++){
            count=minPalPartionRecursion(str,i,k) + minPalPartionRecursion(str,k+1,j) + 1;
            ans=Math.min(ans,count);
        }
        return t[i][j]=ans;
    }

    //DP
    private static int minPalPartionDP(String str, int i, int j) {
        for(int[] row : t)
            Arrays.fill(row,-1);
        if(i>=j)
            return 0;
        if(isPalindrome(str.substring(i,j+1)))
            return 0;
        if(t[i][j]!=-1)
            return t[i][j];

        int left;int right;
        int ans = Integer.MAX_VALUE, count;
        for(int k =i;k<=j-1;k++){
            if(t[i][k]!=-1)
                left = t[i][k];
            else
                left = minPalPartionDP(str,i,k);
            if(t[k+1][j]!=-1)
                right = t[k+1][j];
            else
                right= minPalPartionDP(str,k+1,j);

            count=left+right+1;
            ans=Math.min(ans,count);
        }
        return t[i][j]=ans;
    }



    private static boolean isPalindrome(String str) {
        StringBuffer s = new StringBuffer(str);
        s=s.reverse();
        return s.toString().equals(str);
    }


}

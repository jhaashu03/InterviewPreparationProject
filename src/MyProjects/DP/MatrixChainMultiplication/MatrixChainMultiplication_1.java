package MyProjects.DP.MatrixChainMultiplication;

import java.util.Arrays;

public class MatrixChainMultiplication_1 {
    static int ans = Integer.MAX_VALUE;
    static int[][] t = new int[100][100];
    public static void main(String args[])
    {
        int arr[] = new int[] {40, 20, 30, 10, 30};
        int n = arr.length;

        System.out.println(
                "Recursive Minimum number of multiplications is "
                        + MatrixChainOrderRecursive(arr, 1, n - 1));

        System.out.println(
                "Memorization Minimum number of multiplications is "
                        + MatrixChainOrderMemorization(arr, 1, n - 1));
    }

    //Recursive
    private static int MatrixChainOrderRecursive(int[] arr, int i, int j) {
        if(i>=j)
            return 0;
        for(int k=i;k<=j-1;k++){
            ans = Math.min(ans , MatrixChainOrderRecursive(arr,i,k) +
                                MatrixChainOrderRecursive(arr,k+1,j) +
                                arr[i-1]*arr[k]*arr[j]);
        }
        return ans;
    }

    //Memorization
    private static int MatrixChainOrderMemorization(int[] arr, int i, int j) {
        for (int[] row : t)
            Arrays.fill(row, -1);

        if(t[i][j]!=-1)
            return t[i][j];

        for(int k=i;k<=j-1;k++){
            ans = Math.min(ans , MatrixChainOrderRecursive(arr,i,k) +
                    MatrixChainOrderRecursive(arr,k+1,j) +
                    arr[i-1]*arr[k]*arr[j]);
        }
        return t[i][j]=ans;

    }
}

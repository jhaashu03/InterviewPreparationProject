//Lecture-1

package MyProjects.DP.KnapSack;

import java.util.Arrays;

public class Knapsack {

    public static void main(String args[])
    {
        int val[] = new int[] { 60, 100, 120 };
        int wt[] = new int[] { 10, 20, 30 };
        int W = 50;
        int n = val.length;
        System.out.println(knapSackRec(W, wt, val, n));
        System.out.println(knapSackMemorization(W, wt, val, n));
        System.out.println(knapSackDP(W, wt, val, n));
    }

    //Method-1 Recursive function
    private static int knapSackRec(int w, int[] wt, int[] val, int n) {
        if(n==0||w==0)
            return 0;
        if(wt[n-1]<=w)
            return Math.max(val[n-1]+knapSackRec(w-wt[n-1],wt,val,n-1),
                    knapSackRec(w,wt,val,n-1));
        else
            return knapSackRec(w,wt,val,n-1);
    }

    //Method-2 Memorozation
    private static int knapSackMemorization(int w, int[] wt, int[] val, int n) {
        int t[][] = new int[n+1][w+1];
        for(int i=0;i<n+1;i++)
            for(int j=0;j<w+1;j++)
                t[i][j] = -1;
        if(n==0||w==0)
            return 0;
        if(t[n][w]!=-1)
            return t[n][w];
        if(wt[n-1]<=w)
            return t[n][w] = Math.max(val[n-1] + knapSackRec(w-wt[n-1],wt,val,n-1),
                    knapSackRec(w,wt,val,n-1));
        else
            return t[n][w] = knapSackRec(w,wt,val,n-1);
    }

    //method-3 Dynamic programing
    private static int knapSackDP(int w, int[] wt, int[] val, int n) {
        int[][] t = new int[n+1][w+1];
        int i ,j;
        for(i =0;i<n+1;i++){
            for(j=0;j<w+1;j++){
                if(i==0||j==0)
                    t[i][j] = 0;
                else if(wt[i-1]<=j)
                    t[i][j]= Math.max( val[i-1] + t[i-1][j-wt[i-1]] , t[i-1][j] );
                else
                    t[i][j]= t[i-1][j];
            }
        }
        /*for(int l =0;l<=n;l++)
        {
            for(int m=0;m<=w;m++)
                System.out.print(t[l][m] +" ");
            System.out.println();
        }*/

        return t[n][w];
    }
}

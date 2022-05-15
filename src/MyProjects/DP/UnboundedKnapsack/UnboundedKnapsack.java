package MyProjects.DP.UnboundedKnapsack;

public class UnboundedKnapsack {
    public static void main(String args[])
    {
        int val[] = new int[] { 60, 100, 120 };
        int wt[] = new int[] { 10, 20, 30 };
        int W = 50;
        int n = val.length;
        System.out.println(unboundedKnapSackDP(W, wt, val, n));
    }

    public static int unboundedKnapSackDP(int W, int[] wt, int[] val, int n){
        int[][] t = new int[n+1][W+1];

        for(int i=0;i<n+1;i++){
            for(int j=0;j<W+1;j++){
                if(i==0||j==0)
                    t[i][j] = 0;
                else if(wt[i-1]<=j){
                    t[i][j] = Math.max(val[i-1]+t[i][j-wt[i-1]], t[i-1][j]);
                }
                else
                    t[i][j] = t[i-1][j];
            }
        }
        return t[n][W];
    }
}

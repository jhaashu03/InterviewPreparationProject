//Lecture-3
//https://www.geeksforgeeks.org/coin-change-dp-7/

/*For example, for N = 4 and S = {1,2,3}, there are four solutions: {1,1,1,1},{1,1,2},{2,2},{1,3}.
So output should be 4.
For N = 10 and S = {2, 5, 3, 6},
there are five solutions: {2,2,2,2,2}, {2,2,3,3}, {2,2,6}, {2,3,5} and {5,5}. So the output should be 5.*/


package MyProjects.DP.UnboundedKnapsack;


public class CoinChangeProblemMaximumWays {
    public static void main(String args[])
    {
        int arr[] = {1, 2, 3};
        int n = arr.length;
        int sum = 4;
        System.out.println("Number of ways: "+countWays(arr, n, sum));
    }

    private static int countWays(int[] arr, int n, int sum){
        int[][] t = new int[n+1][sum+1];
        for(int i=0;i<sum+1;i++)
            t[0][i] = 0;
        for(int i=0;i<n+1;i++)
            t[i][0] = 1;

        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                if(arr[i-1]<=j)
                    t[i][j] = t[i][j-arr[i-1]]+t[i-1][j];
                else
                    t[i][j] = t[i-1][j];
            }
        }
        return t[n][sum];
    }
}

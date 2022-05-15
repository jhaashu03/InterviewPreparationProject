//Lecture-4
//https://www.geeksforgeeks.org/find-minimum-number-of-coins-that-make-a-change/

package MyProjects.DP.UnboundedKnapsack;

public class CoinChangeProblemMinimumNumberOfCoinsRequired {

    public static void main(String args[]) {
        int coins[] = {9, 6, 5, 1};
        int m = coins.length;
        int V = 11;
        System.out.println("Minimum coins required is " + minCoins(coins, m, V));
    }

    private static int minCoins(int[] coins, int n, int sum) {
        int[][] t = new int[n + 1][sum + 1];
        for (int i = 0; i < sum + 1; i++)
            t[0][i] = Integer.MAX_VALUE - 1; // Integer.MAX_VALUE - 1 because if we add 1 to Integer.MAX_VALUE it will become the negative value
        for (int i = 0; i < n + 1; i++)
            t[i][0] = 0;

        //not initizating the 2nd row also works fine --- not sure
        /*for (int i = 1; i < sum + 1; i++) {
            if (i % coins[0] == 0)
                t[1][i] = i / coins[0];
            else
                t[1][i] = Integer.MAX_VALUE - 1;;
        }*/

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                if (coins[i-1] <= j)
                    t[i][j] = Math.min(1 + t[i][j - coins[i - 1]], t[i - 1][j]);
                else
                    t[i][j] = t[i - 1][j];
            }
        }
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < sum + 1; j++)
                System.out.print(t[i][j] + " ");
            System.out.println();
        }
        return t[n][sum];
    }
}


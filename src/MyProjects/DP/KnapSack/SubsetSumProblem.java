//Lecture-2

package MyProjects.DP.KnapSack;

/*
* Input: set[] = {3, 34, 4, 12, 5, 2}, sum = 9
Output: True
There is a subset (4, 5) with sum 9.
* */

public class SubsetSumProblem {
    public static void main(String args[])
    {
        //int set[] = { 3, 34, 4, 12, 5, 2 };
        //int sum = 9;
        //int set[]={3, 4, 5, 2};
        int set[]={1, 5, 2, 1, 0, 2, 0};
        int sum = 6;
        int n = set.length;
        if (isSubsetSum(set, n, sum) == true)
            System.out.println("Found a subset" + " with given sum");
        else
            System.out.println("No subset with" + " given sum");
        }

        public static boolean isSubsetSum(int[] arr, int n, int sum) {
            boolean[][] t = new boolean[n+1][sum+1];
            for(int i = 0; i<sum+1;i++)
                t[0][i] = false;
            for(int i = 0; i<n+1;i++)
                t[i][0] = true;

            for(int i=1;i<n+1;i++){
                for(int j=1;j<sum+1;j++){
                    if(arr[i-1]<=j){
                        t[i][j] = t[i-1][j-arr[i-1]]||t[i-1][j];
                    }
                    else
                        t[i][j] = t[i-1][j];
                }
            }

            for(int i=0;i<n+1;i++){
                for(int j=0;j<sum+1;j++)
                    System.out.print(t[i][j]+" ");
                System.out.println();
            }

            return t[n][sum];
        }
}

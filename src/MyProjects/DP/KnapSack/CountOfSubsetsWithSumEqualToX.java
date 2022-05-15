////Lecture-4

package MyProjects.DP.KnapSack;

public class CountOfSubsetsWithSumEqualToX {
    public static void main(String []args)
    {
        int arr[] = { 3, 3, 3, 3 };
        int n = arr.length;
        int x = 6;

        System.out.println(findCount(arr, x, n));
    }

    public static int findCount(int[] arr, int sum, int n){
        int[][] t = new int[n+1][sum+1];
        for(int i = 0; i<sum+1;i++)
            t[0][i] = 0;
        for(int i = 0; i<n+1;i++)
            t[i][0] = 1;

        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                if(arr[i-1]<=j){
                    t[i][j] = t[i-1][j-arr[i-1]]+t[i-1][j];
                }
                else
                    t[i][j] = t[i-1][j];
            }
        }

        /*for(int i=0;i<n+1;i++){
                for(int j=0;j<sum+1;j++)
                    System.out.print(t[i][j]+" ");
                System.out.println();
            }*/
        return t[n][sum];
    }
}

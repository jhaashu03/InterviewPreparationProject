//Lecture-2

//https://www.geeksforgeeks.org/cutting-a-rod-dp-13/
//This problem is same as unbounded knapsack problem
//If len arr is not give take a len array from 1 to N
package MyProjects.DP.UnboundedKnapsack;

public class RodCuttingProblem {
    public static void main(String args[])
    {
        int price[] = { 1, 5, 8, 9, 10, 17, 17, 20 };
        int size = price.length;
        System.out.println("Maximum Obtainable Value is "+ cutRod(price, size));
    }

    public static int cutRod(int[] arr, int n){
        int[] len = new int[n];
        for(int i=1;i<=n;i++){
            len[i-1] =  i;
        }
        return UnboundedKnapsack.unboundedKnapSackDP(n,len,arr,n);
    }
}

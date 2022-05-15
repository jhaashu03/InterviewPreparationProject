//Lecture-3
package MyProjects.DP.KnapSack;
//https://www.geeksforgeeks.org/partition-problem-dp-18/

/*
* arr[] = {1, 5, 11, 5}
Output: true
The array can be partitioned as {1, 5, 5} and {11}

arr[] = {1, 5, 3}
Output: false
The array cannot be partitioned into equal sum sets.*/

import java.util.Arrays;

public class PartitionProblem {
    public static void main(String[] args)
    {

        int arr[] = { 3, 1, 5, 9, 12 };
        //int arr[] = { 4,12,6 };
        int n = arr.length;

        // Function call
        if (findPartition(arr, n))
            System.out.println("Can be divided into two " + "subsets of equal sum");
        else
            System.out.println("Can not be divided into " + "two subsets of equal sum");
    }
    private static boolean findPartition(int[] arr, int n){
        int sum = 0;
        for(int i=0;i<n;i++)
            sum+=arr[i];

        int halfSum = sum/2;
        //If sum of array is not even than it can't be divided into two equal array with same sum
        if(sum%2!=0)
            return false;
        else
            return SubsetSumProblem.isSubsetSum(arr,n,halfSum);
    }
}

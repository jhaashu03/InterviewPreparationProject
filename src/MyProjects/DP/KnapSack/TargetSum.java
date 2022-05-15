//Lecture-7

package MyProjects.DP.KnapSack;

//https://leetcode.com/problems/target-sum/
//This problem is ditto same as CountTheNumberOfSubsetWithAGivenDifference.java they have just made
//problem statement complex

/*
* Input: nums = [1,1,1,1,1], target = 3
Output: 5
Explanation: There are 5 ways to assign symbols to make the sum of nums be target 3.
-1 + 1 + 1 + 1 + 1 = 3
+1 - 1 + 1 + 1 + 1 = 3
+1 + 1 - 1 + 1 + 1 = 3
+1 + 1 + 1 - 1 + 1 = 3
+1 + 1 + 1 + 1 - 1 = 3*/

public class TargetSum {
    public static void main(String[] args)
    {
        int arr[] = {1,1,1,1,1};
        int n = arr.length;
        int sum = 3;

        System.out.println(waysToAssign(arr, n,sum));
    }

    private static int waysToAssign(int[] arr, int n, int sum){
        return CountTheNumberOfSubsetWithAGivenDifference.findCount(arr,n,sum);
    }
}

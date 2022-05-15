//Find the smallest positive integer value that cannot be represented as sum of any subset of a given array
//https://www.geeksforgeeks.org/find-smallest-value-represented-sum-subset-given-array/

package MyProjects.StringAndArray.Array;

public class FindSmallestInteger {
    public FindSmallestInteger(int arr[], int n) {
        int minSum = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= minSum) {
                minSum += arr[i];
            }
        }
        System.out.println(minSum);
    }
}

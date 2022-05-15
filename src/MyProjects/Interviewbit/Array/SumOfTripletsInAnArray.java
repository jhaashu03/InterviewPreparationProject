package MyProjects.Interviewbit.Array;

import java.util.TreeSet;

public class SumOfTripletsInAnArray {
    public static void main(String[] args) {

        int[] a = {2, 5, 3, 1, 4, 9};
        System.out.println(maxSubArray(a,a.length));
    }


    private static int maxSubArray(int[] arr, int n) {
        // Initialize suffix-array
        int maxSuffArr[] = new int[n + 1];

        // Set the last element
        maxSuffArr[n] = 0;

        // Calculate suffix-array containing maximum
        // value for index i, i+1, i+2, ... n-1 in
        // arr[i]
        for (int i = n - 1; i >= 0; --i)
            maxSuffArr[i] = Math.max(maxSuffArr[i + 1],
                    arr[i]);

        int ans = 0;

        // Initialize set container
        TreeSet<Integer> lowValue = new TreeSet<Integer>();

        // Insert minimum value for first comparison
        // in the set
        lowValue.add(Integer.MIN_VALUE);

        for (int i = 0; i < n - 1; ++i) {
            if (maxSuffArr[i + 1] > arr[i]) {
                //lowValue.lower(arr[i])--> element just less than arr[i] but max in the list
                // maxSuffArr[i + 1]-->{9,9,9,9,9,0}
                ans = Math.max(ans, lowValue.lower(arr[i]) +
                        arr[i] + maxSuffArr[i + 1]);

                // Insert arr[i] in set<> for further
                // processing
                lowValue.add(arr[i]);
            }
        }
        return ans;
    }
}

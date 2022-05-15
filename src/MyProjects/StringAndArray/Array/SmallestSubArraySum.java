//Smallest subarray with sum greater than a given value
//https://www.geeksforgeeks.org/minimum-length-subarray-sum-greater-given-value/

package MyProjects.StringAndArray.Array;

public class SmallestSubArraySum {
    public SmallestSubArraySum(int arr[], int n, int key, int minCount) {
        for (int i = 0; i < n - 1; i++) {
            int count = 1;
            int j = i + 1;
            int sum = arr[i];
            if (arr[i] > key) {
                System.out.println(count);
                return;
            }
            while (j < n && sum <= key) {
                sum += arr[j];
                j++;
                count++;
                if (sum > key && count < minCount) {
                    minCount = count;
                }

            }
        }
        if (minCount == Integer.MAX_VALUE)
            System.out.println("Not Possible");
        else
            System.out.println(minCount);
    }
}

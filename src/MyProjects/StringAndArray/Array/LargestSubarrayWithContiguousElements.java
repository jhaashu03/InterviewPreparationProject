//https://www.geeksforgeeks.org/length-largest-subarray-contiguous-elements-set-1/

package MyProjects.StringAndArray.Array;

import java.util.*;

public class LargestSubarrayWithContiguousElements {
    public LargestSubarrayWithContiguousElements(int arr[], int n) {
        int count = 0;
        int maxcount = 0;
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++) {
            int j = i + 1;
            if (arr[j] - arr[i] == 1) {
                count++;
                if (count > maxcount)
                    maxcount = count;
            } else
                count = 0;

        }
        System.out.println("Length of the longest contiguous subarray is " + maxcount + 1);
    }
}

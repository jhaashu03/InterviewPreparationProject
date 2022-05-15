package Test1;

import java.util.Scanner;

public class MinimumCoinsRequired {
    public static void main(String[] s) {
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter key");
        int key = sc.nextInt();

        System.out.println("Minimum coins required is " + minCoins(arr, n, key));


    }

    private static int minCoins(int[] arr, int n, int key) {
        // base case
        if (key == 0) return 0;

        // Initialize result
        int res = Integer.MAX_VALUE;

        // Try every coin that has smaller value than V
        for (int i = 0; i < n; i++) {
            if (arr[i] <= key) {
                int sub_res = minCoins(arr, n, key - arr[i]);

                // Check for INT_MAX to avoid overflow and see if
                // result can minimized
                if (sub_res != Integer.MAX_VALUE && sub_res + 1 < res)
                    res = sub_res + 1;
            }
        }
        return res;
    }
}

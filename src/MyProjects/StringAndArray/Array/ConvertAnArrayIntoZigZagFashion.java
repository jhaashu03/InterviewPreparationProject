package MyProjects.StringAndArray.Array;

public class ConvertAnArrayIntoZigZagFashion {

    public ConvertAnArrayIntoZigZagFashion(int arr[], int n, int count) {
        for (int i = 0; i < n - 1; i++) {
            int next = i + 1;
            if (count % 2 == 0) {

                if (arr[i] > arr[next]) {
                    swap(i, next, arr);
                }

            } else {

                if (arr[i] < arr[next]) {
                    swap(i, next, arr);
                }

            }
            count++;

        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    private void swap(int i, int i2, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[i2];
        arr[i2] = temp;

    }


}

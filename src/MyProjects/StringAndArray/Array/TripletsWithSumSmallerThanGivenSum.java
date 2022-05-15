package MyProjects.StringAndArray.Array;

public class TripletsWithSumSmallerThanGivenSum {
    public void tripletWithSumSmallerThanGivenSum(int arr[], int key) {
        //Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int r = arr.length - 1;
            for (int j = i + 1; j < arr.length; j++) {
                while (r > j) {
                    if ((arr[i] + arr[j] + arr[r] < key)) {
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[r]);
                        r--;
                    } else {
                        r--;
                    }
                }
            }

        }
    }
}

//o(nlogn)

package MyProjects.SearchingAndSorting.Sorting;

public class MergeSort {
    public void mergeSort(int arr[]) {
        int n = arr.length;
        int mid = n / 2;


        if (arr == null) {
            return;
        }
        if (arr.length > 1) {
            int p = 0;
            int q = 0;
            int left[] = new int[mid];
            for (int i = 0; i < mid; i++) {
                left[p++] = arr[i];
            }
            int right[] = new int[arr.length - mid];
            for (int i = mid; i < n; i++) {
                right[q++] = arr[i];
            }
            mergeSort(left);
            mergeSort(right);

            int i = 0;
            int j = 0;
            int k = 0;

            while (i < left.length && j < right.length) {
                if (left[i] < right[j]) {
                    arr[k++] = left[i];
                    i++;
                } else {
                    arr[k++] = right[j];
                    j++;
                }
            }
            while (i < left.length) {
                arr[k++] = left[i];
                i++;
            }
            while (j < right.length) {
                arr[k++] = right[j];
                j++;
            }
        }


    }

    public void print(int arr[]) {
        System.out.println("Merge MyProjects.SearchingAndSorting.Search.Sorting");
        for (int l = 0; l < arr.length; l++)
            System.out.print(arr[l] + " ");
        System.out.println();
    }
}

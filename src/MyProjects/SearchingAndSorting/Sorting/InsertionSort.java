//O(n2)

package MyProjects.SearchingAndSorting.Sorting;

public class InsertionSort {
    public void insertionSort(int n, int arr[]) {
        for (int i = 1; i < n; i++) {
            int value = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > value) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = value;
        }
        System.out.println("Insertion MyProjects.SearchingAndSorting.Search.Sorting");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}

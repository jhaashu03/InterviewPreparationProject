package MyProjects.SearchingAndSorting.Sorting;

public class QuickSort {
    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partition = partition(arr, low, high);
            quickSort(arr, partition + 1, high);
            quickSort(arr, low, partition );
        }
    }

    private int partition(int[] arr, int low, int high) {
        int i = low;
        int j = high;
        int pivot = arr[low];
        while(i<j){
            do{
                i++;
            }while(i<high && arr[i]<=pivot);
            do{
                j--;
            }while(j>low && arr[j]>pivot);
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }

    private void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public void print(int arr[]) {
        System.out.println("Quick MyProjects.SearchingAndSorting.Search.Sorting");
        for (int l = 0; l < arr.length; l++)
            System.out.print(arr[l] + " ");
        System.out.println();
    }

}

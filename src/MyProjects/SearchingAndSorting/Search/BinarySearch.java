package MyProjects.SearchingAndSorting.Search;

public class BinarySearch {
    public boolean binarySearch(int low, int high, int[] arr, int key) {
        if (low <= high) {
            int mid = (low + high) / 2;
            if (key == arr[mid]) {
                return true;
            }
            if (key > arr[mid]) {
                return binarySearch(mid + 1, high, arr, key);
            }
            if (key < arr[mid])
                return binarySearch(low, mid - 1, arr, key);
        }
        return false;
    }
}

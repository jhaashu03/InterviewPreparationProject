package MyProjects.SearchingAndSorting.Search;

public class ArrayWhoseSumIsClosetToX {
    public void arrayWhoseSumIsClosetToX(int arr[], int n, int x) {
        int minSum = Integer.MAX_VALUE;
        int low = 0;
        int high = n - 1;
        int p1 = 0;
        int p2 = 0;
        while (high > low) {
            if (Math.abs(arr[low] + arr[high] - x) < minSum) {
                p1 = arr[low];
                p2 = arr[high];
                minSum = Math.abs(arr[low] + arr[high] - x);
            }
            if (arr[low] + arr[high] > x) {
                high--;
            } else
                low++;
        }
        System.out.println("Array whose sum is closet to " + x + ": [" + p1 + " " + p2 + "]");
    }
}

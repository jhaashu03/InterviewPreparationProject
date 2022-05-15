package MyProjects.BinarySearch;

/*
* to prevent overflow we can use
*
* low+high/2 as low +(high-low)/2*/

public class BinarySearch_1 {
    public static void main(String args[])
    {
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 10;
        int result = myBinarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }

    public static int myBinarySearch(int[] arr, int low, int high, int key) {
        while(low<=high){
            int mid = (low+high)/2;

            if(arr[mid] == key)
                return mid;

            else if(key>arr[mid])
                low=mid+1;
            else
                high = mid-1;
        }
        return -1;
    }
}

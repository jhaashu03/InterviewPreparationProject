package MyProjects.BinarySearch;

public class OrderNotKnownSearch_3 {
    public static void main(String args[])
    {
        int arr[] = { 2, 3, 4, 10, 40,50 };
        int n = arr.length;
        int x = 10;
        int result = myBinarySearchOrderNotKnown(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }

    private static int myBinarySearchOrderNotKnown(int[] arr, int low, int high, int x) {
        if(arr.length==1)
            if(arr[0]==x)
                return 0;
            else
                return -1;

        else if(arr[low]<arr[high])
            return  BinarySearch_1.myBinarySearch(arr,low,high,x);
        else
            return BinarySearchOnReverseSortedArray_2.binarySearchDesc(arr,low,high,x);

    }
}

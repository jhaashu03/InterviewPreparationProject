package MyProjects.BinarySearch;

import static MyProjects.BinarySearch.PeakElement_13.peakElement;
import static MyProjects.BinarySearch.PeakElement_13.peakElementIndex;

/*
arr     1,3,8,12,4,2
peak 12

So array 1,3,8 is sorted
and 12,4,2 is also sorted
thus apply BS on both the array
* */
public class SearchAnElementInBitonicArray_15 {
    public static void main(String[] args)
    {
        int arr[] = {1,3,8,12,4,2};
        int key = 4;
        System.out.print(findElement(arr, 0,arr.length-1,key));
    }

    private static int findElement(int[] arr, int low, int high, int key) {
        int peakElement = peakElementIndex(arr, 0,high);

        return Math.max(BinarySearch_1.myBinarySearch(arr,low,peakElement-1,key),
                BinarySearch_1.myBinarySearch(arr,peakElement,high,key));
    }
}

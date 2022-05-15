package MyProjects.BinarySearch;

import MyProjects.SearchingAndSorting.Search.BinarySearch;

public class FindAnElementInARotatedSortedArray_7 {
    public static void main (String[] args)
    {
        int arr[] = {11,12,15,18,2,5,6,8};
        int n = arr.length;

        int key = 15;

        System.out.println(findElement(arr,0, n,key));
    }

    private static int findElement(int[] arr, int low, int high, int key) {
        int minEleIndex = NumberOfTimesASortedArrayIsRotated_6.countRotations(arr,high);
        if(key>arr[low])
            return BinarySearch_1.myBinarySearch(arr,low,minEleIndex-1,key);
        else if(key<arr[low])
            return BinarySearch_1.myBinarySearch(arr,minEleIndex+1,high,key);
        else if(key==arr[minEleIndex])
            return minEleIndex;
        return -1;
    }
}

package MyProjects.BinarySearch;

/*Given a sorted array,
find the element in the array which has minimum difference with the given number.*/

import java.util.Map;

public class MinimumDifferenceElementInASortedArray_12 {
    public static void main(String[] args)
    {
        //infinite sorted binary array of 0's and 1's
        int arr[] = { 1,3,8,10,15};
        int x = 12;
        System.out.print(minimumDifferenceElement(arr, 0,arr.length-1,x));
    }

    private static int minimumDifferenceElement(int[] arr, int low, int high, int key) {
        int floor = FindFloorAndCeilOfAnElementInASortedArray_9.floorSearch(arr,low,high,key);
        int ceil = FindFloorAndCeilOfAnElementInASortedArray_9.ceilSearch(arr,low,high,key);

        return Math.min(Math.abs(key-arr[floor]),Math.abs(arr[ceil]-key));
    }
}

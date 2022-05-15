//https://www.geeksforgeeks.org/search-almost-sorted-array/

/*Given an array which is sorted, but after sorting some elements are moved to either of the
adjacent positions, i.e., arr[i] may be present at arr[i+1] or arr[i-1]. Write an efficient
function to search an element in this array. Basically the element arr[i] can only be swapped
with either arr[i+1] or arr[i-1].

For example consider the array {2, 3, 10, 4, 40}, 4 is moved to next position and 10 is moved
to previous position.

Example :
Input: arr[] =  {10, 3, 40, 20, 50, 80, 70}, key = 40
Output: 2
Output is index of 40 in given array*/

package MyProjects.BinarySearch;

public class SearchingInANearlySortedArray_8 {
    public static void main(String args[])
    {
        int arr[] = {3, 2, 10, 4, 40};
        int n = arr.length;
        int x = 4;
        int result = binarySearchInANearlySortedArray(arr, 0, n - 1, x);
        if(result == -1)
            System.out.println("Element is not present in array");
        else
            System.out.println("Element is present at index " +
                    result);
    }

    private static int binarySearchInANearlySortedArray(int[] arr, int low, int high, int key) {
        while(low<=high){
            int mid = low+(high-low)/2;

            if(arr[mid]==key)
                return mid;
            else if(mid-1>=low && arr[mid-1]==key)
                return mid-1;
            else if(mid+1<=high && arr[mid+1]==key)
                return mid+1;
            else if(key>arr[mid])
                low = mid+2;
            else
                high = mid-2;
        }
        return -1;
    }
}

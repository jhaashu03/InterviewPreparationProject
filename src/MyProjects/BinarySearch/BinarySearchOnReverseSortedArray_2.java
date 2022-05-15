package MyProjects.BinarySearch;

public class BinarySearchOnReverseSortedArray_2 {
    public static void main(String[] args)
    {
        int arr[] = { 5, 4, 3, 2, 1 };
        int N = arr.length;
        int X = 1;
        System.out.println(
                binarySearchDesc(arr,0, N, X));
    }

    public static int binarySearchDesc(int[] arr,int low, int high, int x) {
        while(low<=high){
            int mid = low+(high-low)/2; //to avoid overflow

            if(arr[mid]==x)
                return mid;
            else if(x<arr[mid])
                low=mid+1;
            else
                high= mid-1;

        }
        return -1;
    }
}

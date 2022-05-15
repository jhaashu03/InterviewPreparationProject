package MyProjects.BinarySearch;

public class FindPositionOfAnelementInAnInfiniteSortedArray_10 {
    public static void main(String[] args) {
        //Let's assume this as infinite array i.e we don't know the size
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        int key=8;

        System.out.println("Element "+key+" is found at "+find(arr,key)+"'th position");
    }

    private static int find(int[] arr, int key) {
        //Initially assign
        int low=0;
        int high = 1;

        while(key>arr[high]){
            low=high;
            high = 2*high;
        }

        //now we have low and high so let call binary search on it
        return BinarySearch_1.myBinarySearch(arr,low,high,key);
    }
}

package MyProjects.BinarySearch;

public class CountOfAnElementInASortedArray_5 {
    public static void main(String[] args)
    {
        int arr[] = {1, 2, 2, 2, 2, 3, 4, 7, 8, 8};
        int n = arr.length-1;
        int x = 2;
        System.out.print(countOccurrences(arr, 0, n, x));
    }

    private static int countOccurrences(int[] arr, int low, int high, int key) {
        int firstOcc = FirstAndLastOccurrenceOfAnElement_4.findOccurrence(arr,low,high,key,true);
        int lastOcc = FirstAndLastOccurrenceOfAnElement_4.findOccurrence(arr,low,high,key,false);
        if(firstOcc==-1)
            return -1;
        else
            return lastOcc-firstOcc+1;
    }
}

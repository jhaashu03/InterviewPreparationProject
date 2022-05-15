package MyProjects.BinarySearch;

public class IndexOfFirst1InABinarySortedInfiniteArray_11 {
    public static void main(String[] args)
    {
        //infinite sorted binary array of 0's and 1's
        int arr[] = { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1 };
        int x = 1;
        System.out.print(findOccurenceOf1(arr, x));
    }

    private static int findOccurenceOf1(int[] arr, int key) {
        int low=0;
        int high = 1;

        while(arr[high]<key){
            low=high;
            high=2*high;
        }

        return FirstAndLastOccurrenceOfAnElement_4.findOccurrence(arr,low,high,key,true);

    }
}

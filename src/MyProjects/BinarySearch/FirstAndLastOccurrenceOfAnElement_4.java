package MyProjects.BinarySearch;

public class FirstAndLastOccurrenceOfAnElement_4 {
    public static void main(String[] args)
    {
        int arr[] = { 1, 2, 2, 2, 2, 3, 4, 7, 8, 8 };
        int x = 2;
        findFirstAndLast(arr,0,arr.length-1, x);
    }

    public static void findFirstAndLast(int[] arr,int low, int high, int key) {

        int firstOccurrence = findOccurrence(arr,low,high,key,true);

        int lastOccurrence = findOccurrence(arr,low,high,key,false);

        System.out.println("First Occurrence "+ firstOccurrence);
        System.out.println("Last Occurrence "+ lastOccurrence);
    }

    public static int findOccurrence(int[] arr, int low, int high, int key, boolean findfirst) {
        //findfirst = true->first Occurrence
        //findfirst = false-> Occurrence
        int result = -1;
        while(low<=high){

            int mid = low +(high-low)/2;

            if(arr[mid] == key){
                if(findfirst){
                    result = mid;
                    high = mid-1;
                }
                else{
                    result = mid;
                    low = mid+1;
                }
            }

            else if(key>arr[mid])
                low= mid+1;
            else
                high = mid-1;
        }

        return result;
    }
}

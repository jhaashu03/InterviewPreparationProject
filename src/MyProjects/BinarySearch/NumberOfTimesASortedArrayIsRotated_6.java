package MyProjects.BinarySearch;

/*
* index->   0   1   2   3   4   5
* Org arr   2   3   6   12  15  18
* given arr 15  18  2   3   6   12
*
* So we can observe number of times an array is rotated is index of min arr in the given array*

instead of arr[mid+1] use arr[(mid+1)%n] we that if mid is 5 mid+1%n will be 0
* and instead of arr[mid-1](kyoki agar mid 0 huaa toh issue ho jayega) use arr[(mid+n-1)%n]
*
* and humra min number hamesha unsorted array mein hoga
* for ex 11 12  15  18  2   5   6   8
* mid->18
*
* we have have two array now low to mid and mid se high
*
* ie. 11   12  15   18 and 18   2   5   6   8 => yeh unsorted array hai aur hamersa ans issi
* mein hoga so move low=mid+1
* else high = mid-1(agar left wala unsorted huaa toh)
*
* Kaise pata chaelga konse side sorted hai? Compare a[low] ko a[mid] se
* if(a[mid]>a[low] se matlub left side sorted hai)
 */
public class NumberOfTimesASortedArrayIsRotated_6 {
    public static void main (String[] args)
    {
        int arr[] = {11,12,15,18,2,5,6,8};
        //int arr[] = {7, 9, 11, 12, 5};
        int n = arr.length;

        System.out.println(countRotations(arr, n));
    }


    public static int countRotations(int[] arr, int n) {
        int low=0;
        int high = n-1;
        while(low<=high){

            if (arr[low] <= arr[high]) {
                return low;
            }
            int mid = low+ (high-low)/2;

            if(arr[mid]<=arr[(mid+n-1)%n] && arr[mid]<=arr[(mid+1)%n]){
                return mid;
            }
            else if(arr[low]<=arr[mid])
                low = mid+1;
            else if(arr[mid]<=arr[high])
                high=mid-1;
        }
        return 0;
    }
}

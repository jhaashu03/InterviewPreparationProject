package MyProjects.BinarySearch;

//https://www.geeksforgeeks.org/find-a-peak-in-a-given-array/

/* arr 5, 10, 20, 15
low=0;high=3 => mid =1
a[mid]>a[mid-1] but a[mid]<a[mid+1]
So we need to move towards right because already we know that a[mid-1] can not be
peak element becuase a[mid]>a[mid-1] but on right hand side a[mid+1]>a[mid] so
a[mid+1] could be a possible ans
* */

public class PeakElement_13 {
    public static void main(String[] args)
    {
        int arr[] = {10, 20, 15, 2, 23, 90, 70};
        System.out.print(peakElement(arr, 0,arr.length-1));
    }

    public static int peakElement(int[] arr, int low, int high) {
        while(low<=high){

            int mid = low+(high-low)/2;

            if(mid==0){
                if(arr[0]>arr[1])
                    return arr[0];
                else
                    return arr[1];
            }

            if(mid==high)
                if(arr[mid]>arr[high])
                    return arr[mid];
                else
                    return arr[high];

            if(mid>0&& mid<high && arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                return arr[mid];
            }
            if(arr[mid+1]>arr[mid])
                low=mid+1;
            else if(arr[mid-1]>arr[mid])
                high=mid-1;
        }
        return -1;
    }

    public static int peakElementIndex(int[] arr, int low, int high) {
        while(low<=high){

            int mid = low+(high-low)/2;

            if(mid==0){
                if(arr[0]>arr[1])
                    return 0;
                else
                    return 1;
            }

            if(mid==high)
                if(arr[mid]>arr[high])
                    return mid;
                else
                    return high;

            if(mid>0&& mid<high && arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                return mid;
            }
            if(arr[mid+1]>arr[mid])
                low=mid+1;
            else if(arr[mid-1]>arr[mid])
                high=mid-1;
        }
        return -1;
    }
}

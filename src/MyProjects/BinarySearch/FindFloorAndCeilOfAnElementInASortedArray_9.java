package MyProjects.BinarySearch;

public class FindFloorAndCeilOfAnElementInASortedArray_9 {
    public static void main(String[] args)
    {
        int arr[] = { 1, 2, 4, 6, 10, 12, 14 };
        int n = arr.length;
        int x = 11;
        int y = 11;
        int index1 = floorSearch(arr, 0, n - 1, x);
        int index2 = ceilSearch(arr, 0, n - 1, y);
        if (index1 == -1)
            System.out.println(
                    "Floor of " + x + " dosen't exist in array ");
        else if(index1>=0)
            System.out.println(
                    "Floor of " + x + " is " + arr[index1]);
        if (index2 == -1)
            System.out.println(
                    "Ceil of " + x + " dosen't exist in array ");
        else if(index2>=0)
            System.out.println(
                    "Ceil of " + y + " is " + arr[index2]);
    }

    public static int floorSearch(int[] arr, int low, int high, int key) {
        int res=-1;
        while(low<=high){
            int mid = low + (high-low)/2;

            if(arr[mid]==key)
                return mid;
            else if(arr[mid]>key){
                high=mid-1;
            }
            else if(arr[mid]<=key){
                low= mid+1;
                res = Math.max(res,mid);
            }
        }
        return res;
    }

    public static int ceilSearch(int[] arr, int low, int high, int key) {
        int res= Integer.MAX_VALUE;
        while(low<=high){
            int mid = low + (high-low)/2;

            if(arr[mid]==key)
                return mid;
            else if(arr[mid]>=key){
                high=mid-1;
                res = Math.min(res,mid);
            }
            else if(arr[mid]<=key){
                low= mid+1;
            }
        }
        return res;
    }
}

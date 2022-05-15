//https://www.geeksforgeeks.org/maximum-difference-between-two-elements/

//Maximum difference between two elements
// such that larger element appears after the smaller number

/*Input : arr = {2, 3, 10, 6, 4, 8, 1}
Output : 8
Explanation : The maximum difference is between 10 and 2.

Input : arr = {7, 9, 5, 6, 3, 2}
Output : 2
Explanation : The maximum difference is between 9 and 7.*/

package MyProjects.Interview;

public class MaximumDifferenceBetweenTwoElements {
    public static void main(String[] args)
    {
        //int arr[] = {1, 2, 90, 10, 110};
        int arr[] = {2, 3, 10, 6, 4, 8, 1};
        System.out.println("Maximum difference is " + maxDiffMethod1(arr, arr.length));
        System.out.println("Maximum difference is " + maxDiffMethod2(arr, arr.length));
    }


    //method-1
    //Using extra space and O(n)
    private static int maxDiffMethod1(int[] arr, int n) {

        //Store max value from the end of the array
        int maxArr[] = new int[n];

        int maxDiff=0;

        maxArr[n-1]=arr[n-1];

        for(int i=n-2;i>=0;i--){
            maxArr[i]= Math.max(maxArr[i+1],arr[i]);
        }
        for(int i=0;i<n;i++)
            System.out.print(maxArr[i]+" ");
        System.out.println();

        for(int i=0;i<n;i++){
            maxDiff=Math.max(maxDiff,maxArr[i]-arr[i]);
        }
        return maxDiff;
    }

    //Method-2
    //Without any extra space and O(n)
    private static int maxDiffMethod2(int[] arr, int n) {
        int min_element = arr[0];
        int max_diff = Integer.MIN_VALUE;

        for(int i=1;i<n;i++){
            if(arr[i]-min_element>max_diff)
                max_diff = arr[i]-min_element;

            if(arr[i]<min_element)
                min_element=arr[i];
        }
        return max_diff;
    }
}

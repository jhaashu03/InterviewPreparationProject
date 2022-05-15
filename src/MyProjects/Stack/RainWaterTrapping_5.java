package MyProjects.Stack;

import java.util.Arrays;
import java.util.Map;

/*
*
* arr = 3 0 0 2 0 4
* for any index i water storega will be min(max of left array of i,max of right array of i)-arr[i]
*
* arr[]     3   0   0   2   0   4
* maxL      3   3   3   3   3   4 -> first maxL[0] = arr[0] than compare maxL[i] with arr[i+1] and put max of that in maxL
* maxR      4   4   4   4   4   4 -> first macl[n-1]=arr[n-1] than compare
* min       3   3   3   3   3   4  -> min(maxL,maxR)
* -arr      0   3   3   1   3   0  -> substract arr
* Add all => 0+3+3+1+3+0 = 10 ans */
public class RainWaterTrapping_5 {
    public static void main(String[] args)
    {
        /*int[] arr = { 0, 1, 0, 2, 1, 0,
                1, 3, 2, 1, 2, 1 };*/
        int[] arr = {3,0,0,2,0,4};
        int n = arr.length;

        System.out.print(maxWater(arr,n));
    }

    private static int maxWater(int[] arr, int n) {
        int[] maxInLeftArray = new int[n];
        int[] maxInRightArray = new int[n];

        maxInLeftArray[0] = arr[0];
        maxInRightArray[n-1] = arr[n-1];

        for(int i=1;i<n;i++){
            maxInLeftArray[i] = Math.max(maxInLeftArray[i-1],arr[i]);
        }

        /*System.out.println("Left Max Array");
        for(Integer i : maxInLeftArray)
            System.out.print(i+" ");
        System.out.println();*/

        for(int i=n-2;i>=0;i--){
            maxInRightArray[i] = Math.max(maxInRightArray[i+1],arr[i]);
        }

        /*System.out.println("Right Max Array");
        for(Integer i : maxInRightArray)
            System.out.print(i+" ");
        System.out.println();*/


        int[] water = new int[n];

        for(int i=0;i<n;i++){
            water[i] = Math.min(maxInLeftArray[i],maxInRightArray[i])-arr[i];
        }

        /*System.out.println("Water array");
        for(Integer i : water)
            System.out.print(i+" ");
        System.out.println();*/

        int sum =0;
        for(int i=0;i<n;i++)
            sum+=water[i];

        return sum;
    }
}

package MyProjects.SlidingWindowProblem.VariableSizeSlidingWindow;


/*Given an array containing N positive integers and an integer K.
Your task is to find the length of the longest Sub-Array with sum of the elements
equal to the given value K.

For Input:
1
7 5
4 1 1 1 2 3 5
your output is:
4*/


public class LargestSubarrayOfSumK_1 {
    public static void main(String args[])
    {
        int[] arr = {4, 1, 1, 1, 2, 3, 5};
        int n = arr.length;
        int k = 5;
        System.out.println("Length = " +
                lenOfLongSubarr(arr, n, k));
    }

    private static int lenOfLongSubarr(int[] arr, int n, int givenSum){
        int i=0;
        int j=0;
        int windowLen=0;
        int maxWindowLen=0;
        int currentSum=0;
        while(j<n && i<n){
            currentSum+=arr[j];
            if(currentSum==givenSum){
                windowLen=j-i+1;
                maxWindowLen=Math.max(maxWindowLen,windowLen);
                j++;
                //currentSum=currentSum-arr[i];
                //i++;
            }
            else if(currentSum<givenSum){
                j++;
            }
            else if(currentSum>givenSum){
                //currentSum=currentSum-arr[i];
                //i++;
                while(currentSum>givenSum){
                    currentSum=currentSum-arr[i];
                    i++;
                }
                j++;
            }
        }
        return maxWindowLen;
    }
}

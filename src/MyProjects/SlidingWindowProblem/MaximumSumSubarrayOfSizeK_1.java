//https://www.geeksforgeeks.org/find-maximum-minimum-sum-subarray-size-k/

package MyProjects.SlidingWindowProblem;

public class MaximumSumSubarrayOfSizeK_1 {
    public static void main(String args[]){
        int arr[] = {1, 4, 2, 10, 2, 3, 1, 0, 20};
        int k = 4;
        int n = arr.length;
        System.out.println(maxSum(arr, n, k));
    }

    private static int maxSum(int[] arr, int n, int k) {
        int sum=0;
        int result = 0;
        int j=0;int i=0;
        while (j<n){
            sum+=arr[j];
            if((j-i+1)==k){
                result=Math.max(result,sum);
                sum-=arr[i];
                i++;
                j++;
            }
            else if(j-i+1<k) {
                j++;
            }

        }
        return result;
    }
}

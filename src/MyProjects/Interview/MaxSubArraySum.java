package MyProjects.Interview;

public class MaxSubArraySum {
    public static void main(String[] args)
    {
        int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int n = a.length;
        int max_sum = maxSubArraySum(a, n);
        System.out.println("Maximum contiguous sum is "
                + max_sum);
    }

    private static int maxSubArraySum(int[] a, int n) {
        int current_max = a[0];
        int max = a[0];
        for(int i=1;i<n; i++){
            current_max = Math.max(a[i],current_max+a[i]);
            max = Math.max(current_max,max);
        }
        return max;
        //int[] a = {2, 5, 3, 1, 4, 9};
    }
}

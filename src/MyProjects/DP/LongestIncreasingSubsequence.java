package MyProjects.DP;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
    public static void main(String args[]){
        int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
        int n = arr.length;
        System.out.println(LIS(arr,n));
    }

    private static int LIS(int[] arr, int n) {
        int l[] = new int[n];
        Arrays.fill(l,1);
        //i = current element
        //j = prev element
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j]){
                    l[i] = Math.max(l[j]+1,l[i]);
                }
            }
        }
        int max = l[0];
        for(int i =1; i<n;i++){
            if(max<l[i])
                max = l[i];
        }
        return max;

    }
}

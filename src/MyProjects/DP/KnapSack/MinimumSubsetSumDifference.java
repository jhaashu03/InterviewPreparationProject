//Lecture-5

package MyProjects.DP.KnapSack;

//https://www.geeksforgeeks.org/partition-a-set-into-two-subsets-such-that-the-difference-of-subset-sums-is-minimum/
//https://www.youtube.com/watch?v=-GtpxG6l_Mc&list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go&index=10

/*
* Input:  arr[] = {1, 6, 11, 5}
Output: 1
Explanation:
Subset1 = {1, 5, 6}, sum of Subset1 = 12
Subset2 = {11}, sum of Subset2 = 11
*
* |s2-s1| should be minimized(let's assume s2>s1)
*
* arr[] => two subset s1 and s2
*
* s1+s2 = sum
*
* s2 = sum-s1
*
* i.e |s2-s1| = |sum-s1-s1| = |sum-2s1| should be minimized and possible values of s1 can be found from table
* t last col. i.e possible values will be box will with value true
* */

import java.util.ArrayList;

public class MinimumSubsetSumDifference {
    public static void main(String[] args)
    {
        //int arr[] = { 3, 1, 4, 2, 2, 1 };
        int arr[] = { 1,2,7 };
        int n = arr.length;

        System.out.println("The minimum difference between 2 sets is " + findMin(arr, n));
    }

    private static int findMin(int[] arr, int n){
        int min = Integer.MAX_VALUE;
        ArrayList l = new ArrayList();
        int sum =0;
        for(int i=0;i<n;i++)
            sum+=arr[i];
        boolean[][] t = new boolean[n+1][sum+1];
        subsetSum(arr,t,sum,n,l);

        for(int i =0;i<l.size();i++){
            if((Boolean) l.get(i))
                min = Math.min(min, sum-2*i);
            //System.out.println(min);
        }
        return min;
    }

    private static void subsetSum(int[] arr, boolean[][] t, int range, int n, ArrayList l){
        int count = 0;
        for(int i=0;i<range+1;i++)
            t[0][i] = false;
        for(int i =0;i<n+1;i++)
            t[i][0]= true;

        for(int i =1;i<n+1;i++){
            for(int j=1;j<range+1;j++){
                if(arr[i-1]<=j)
                    t[i][j] = t[i-1][j-arr[i-1]] || t[i-1][j] ;
                else
                    t[i][j] = t[i-1][j];
                //put possible value of s1 into ArrayList
                if(i==n && count<=range/2){
                    l.add(t[i][count]);
                    count++;
                }
            }
        }
        for(int i=0;i<n+1;i++){
            for(int j=0;j<range+1;j++)
                System.out.print(t[i][j]+" ");
            System.out.println();
        }
        System.out.println("Arraylist");
        for(int i=0;i<l.size();i++)
            System.out.print(l.get(i)+" ");
        System.out.println();
        System.out.println("-------------------------------------------------------");
    }
}

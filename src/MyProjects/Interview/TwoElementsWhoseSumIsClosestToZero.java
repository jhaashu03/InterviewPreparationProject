package MyProjects.Interview;


//https://www.geeksforgeeks.org/two-elements-whose-sum-is-closest-to-zero/
/*
* Input:
N = 6
arr[] = {-21 -67 -37 -18 4 -65}
Output: -14
Explanation: Sum of two elements closest to
zero is -14 using numbers -18 and 4.*/
public class TwoElementsWhoseSumIsClosestToZero {
    static public void main(String[] args) {
        //int[] A = {-21, -67, -37, -18, 4, -65};
        int[] A = {-8 ,-66 ,-60};
        elementsClosestToZero(A,A.length);
    }

    private static void elementsClosestToZero(int[] a, int length) {
        int i =0;
        int j = length-1;
        int ans = 0;
        int minSum = Integer.MAX_VALUE;
        while(j>i){
            if(Math.abs(a[i])>Math.abs(a[j])){
                int sum = Math.abs(a[i]+a[j]);
                if(sum<minSum){
                    minSum=sum;
                    ans = a[i]+a[j];
                }
                i++;
            }
            else{
                int sum = Math.abs(a[i]+a[j]);
                if(sum<minSum){
                    minSum=sum;
                    ans = a[i]+a[j];
                }
                j--;
            }
        }
        System.out.println(ans);
    }
}

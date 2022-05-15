/*
* Input:
n = 5
A[] = {1,3,5,2,2}
Output: 3
Explanation: For second test case
equilibrium point is at position 3
as elements before it (1+3) =
elements after it (2+2).
* */

package MyProjects.Interview;

public class EquilibriumPoint {
    public static void main(String args[])
    {
        int A[] = {1,3,5,2,2};
        System.out.println(findEquilibriumPoint(A,A.length));
    }

    private static int findEquilibriumPoint(int[] a, int length) {
        int sumi = a[0];
        int sumj = a[length-1];
        int i =1;
        int j = length-2;
        while(j>i){
            if(sumi<sumj){
                sumi+=a[i];
                i++;
            }
            else if(sumi>sumj){
                sumj+=a[j];
                j--;
            }
            if(sumi==sumj && j==i)
                return i+1;
        }
        return -1;
    }
}

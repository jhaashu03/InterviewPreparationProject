package MyProjects.Interview;

/*
* Input:
N = 5, K = 3
arr[] = {1,2,3,4,5}
Output: 3 2 1 5 4
Explanation: First group consists of elements
1, 2, 3. Second group consists of 4,5.*/


import java.util.Stack;

public class ReverseArrayInGroups {
    public static void main(String args[])
    {
        int A[] = {1,2,3,4,5};
        int k =3;
        ReverseArray(A,A.length,k);
    }

    private static void ReverseArray(int[] a, int length, int k) {
        Stack s = new Stack<Integer>();
        int j =0;
        for(int i =0;i<length;i+=k){
            int left = i;
            int right = Math.min(i+k-1,length-1);
            while(left<right){
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++;
                right--;
            }
        }
        for(int i: a)
            System.out.println(i);

    }
}

package MyProjects.Interview;
// https://www.geeksforgeeks.org/find-the-element-before-which-all-the-elements-are-smaller-than-it-and-after-which-all-are-greater-than-it/

import java.util.Stack;

/*
* Input:
N = 4
A[] = {4, 2, 5, 7}
Output:
5
Explanation:
Elements on left of 5 are smaller than 5
and on right of it are greater than 5.
* */
//5, 3, 6,2, 7, 9
//9 7 2 2 2 2
//5 5 6 6 7 9
public class LeftSideSmallerAndRightSideGreater {
    public static void main(String args[]){
        int[] arr = {5, 1, 4, 3, 6, 8, 10, 7, 9};
        int n = arr.length;
        System.out.println("Index of the element is " +
                findElement(arr, n));
    }

    private static int findElement(int[] arr, int n) {
        int ans =Integer.MIN_VALUE;
        Stack s = new Stack<Integer>();
        boolean flag = false;
        s.push(arr[0]);
        for(int i=1;i<n;i++){
            if(arr[i]<ans){
                return -1;
            }
            int top = (int) s.peek();
            if(top>arr[i]){
                s.push(arr[i]);
            }
            else{
                while(!s.empty()&& arr[i]>top){
                    s.pop();
                    if(s.isEmpty() && !flag){
                        ans=arr[i];
                        flag = true;
                    }
                    else if(!s.isEmpty())
                        top= (int)s.peek();

                }
                s.push(arr[i]);
            }

        }
        if(flag)
            return ans;
        else
            return -1;
    }
}

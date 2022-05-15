package MyProjects.SlidingWindowProblem;

import java.util.Deque;
import java.util.LinkedList;

public class FirstNegativeNumberInEveryWindowOfSizeK_2 {
    public static void main(String args[])
    {
        int arr[] = {12, -1, -7, 8, -15, 30, 16, 28};
        int n = arr.length;
        int k = 3;
        printFirstNegativeInteger(arr, n, k);

    }

    private static void printFirstNegativeInteger(int[] arr, int n, int k) {
        int i=0;
        int j=0;
        Deque<Integer> deque = new LinkedList();

        while(j<n){
            if(arr[j]<0){
                deque.addLast(j);
            }
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                if(deque.size()==0)
                    System.out.print("0"+" ");
                else
                    System.out.print(arr[deque.peekFirst()]+" ");
                j++;

                // Remove the elements which are
                // out of this window from the queue
                if(deque.contains(i)){
                    deque.removeFirst();
                }
                i++;
            }
        }
    }
}

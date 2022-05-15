package MyProjects.SlidingWindowProblem;

import java.util.Deque;
import java.util.LinkedList;

public class MaximumOfAllSubarraysOfSizeK_4 {
    public static void main(String args[])
    {
        int arr[] = { 8, 5, 10, 7, 9, 4, 15, 12, 90, 13 };
        int k = 3;
        printKMax(arr, arr.length, k);
    }

    public static void printKMax(int[] arr, int n, int k){
        int i=0;
        int j=1;
        Deque<Integer> deque = new LinkedList<>();
        deque.addLast(arr[0]);
        while(j<n){
            //keep only kaam ka element in the queue, remove all the element less then current element
            while(deque.size()!=0 && deque.peekLast()<arr[j]){
                deque.removeLast();
            }
            deque.addLast(arr[j]);
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                System.out.print(deque.peekFirst()+" ");
                if(arr[i]==deque.peekFirst()){
                    deque.removeFirst();
                }
                i++;
                j++;
            }

        }
    }
}

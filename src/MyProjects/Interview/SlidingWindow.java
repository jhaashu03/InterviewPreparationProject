package MyProjects.Interview;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class SlidingWindow {
    public static void main(String agrs[]) {
        int arr[] = {9, 7, 2, 4, 6, 8, 2, 1, 5};
        int k =3;
        printSlidingWindowMax(arr,arr.length,k);

    }

    private static void printSlidingWindowMax(int[] arr, int length,int k) {
       Deque<Integer> q = new LinkedList<>();
       int i;
       for(i=0;i<k;++i){
           while(!q.isEmpty() && arr[i]>=arr[q.peekLast()]){
               q.removeLast();
           }
           q.addLast(i);
       }
       for(;i<length;++i){

           System.out.print(arr[q.peekFirst()]+", ");

           while(!q.isEmpty() && q.peekFirst()<=i-k)
               q.removeFirst();

           while (!q.isEmpty() && arr[i]>=arr[q.peekLast()]){
               q.removeLast();
           }
           q.addLast(i);
       }
       System.out.print(arr[q.peekFirst()]);
    }
}

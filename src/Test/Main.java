package Test;

import java.util.*;

public class Main {

    public static void main(String args[]){
        int arr[] = {12, -1, -7, 8, -15, 30, 16, 28};
        int n = arr.length;
        int k = 3;
        FirstNegativeInteger(arr, n, k);
    }

    private static void FirstNegativeInteger(int[] arr, int n, int k) {
        int i=0;int j=0;
        Deque<Integer> deque = new LinkedList<>();
        while(j<n){
            if(arr[j]<0)
                deque.addLast(arr[j]);
            if(j-i+1<k)
                j++;
            else{
                if(deque.size()==0)
                    System.out.println("0"+" ");
                else{
                    System.out.println(deque.peekFirst()+" ");
                }
                j++;
                if(deque.contains(arr[i]))
                    deque.removeFirst();
                i++;
            }
        }
    }


}
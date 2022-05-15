package MyProjects.Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class SortAKSortedArray_3 {
    public static void main(String[] args)
    {
        int k = 3;
        int arr[] = { 2, 6, 3, 12, 56, 8 };
        int n = arr.length;
        System.out.println("Following is sorted array");
        kSort(arr, n, k);
    }

    private static void kSort(int[] arr, int n, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(Integer i : arr){
            minHeap.offer(i);
            if(minHeap.size()>k){
                System.out.print(minHeap.poll()+" ");
            }
        }
        while(!minHeap.isEmpty()){
            System.out.print(minHeap.poll()+" ");
        }
    }
}

package MyProjects.Heap;

import java.util.Comparator;
import java.util.PriorityQueue;
/*
* Ggar problem mein k diya hai aur max ya min pucha hai toh heap legega
* And sort karne ka feel aayega
*
* Kth smallest => max heap
* kth largest  => min heap
* */
public class kthSmallestElement_1 {
    public static void main(String[] args)
    {
        int arr[] = { 12, 3, 5, 7, 19 };
        int n = arr.length, k = 3;
        System.out.print(k+"'th smallest element is " + kthSmallest(arr, n, k));
    }

    public static int kthSmallest(int[] arr, int n, int k) {
        //minheap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b)->a-b);
        //OR
        PriorityQueue<Integer> minHeap2 = new PriorityQueue<>();

        //maxHeap
        //PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->b-a);
        //OR
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        for(int e: arr){
            maxHeap.offer(e);
            if(maxHeap.size()>k)
                maxHeap.poll();
        }

        return maxHeap.peek();
    }

}

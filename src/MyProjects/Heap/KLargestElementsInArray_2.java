package MyProjects.Heap;

/*For example, if given array is [1, 23, 12, 9, 30, 2, 50]
and you are asked for the largest 3 elements i.e., k = 3
then your program should print 50, 30 and 23.*/

import java.util.PriorityQueue;

public class KLargestElementsInArray_2 {
    public static void main (String[] args)
    {
        int arr[] = { 7,10,4,3,20,15 }; // 3 largest elements is 10,15,20

        int size = arr.length;

        int k = 3;

        largestKelements(arr, size, k);
    }

    private static void largestKelements(int[] arr, int size, int k) {

        //Largest pucha hai toh min heap use karenge
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int element: arr){
            minHeap.offer(element);
            if(minHeap.size()>k)
                minHeap.poll();
        }

        for(Integer i: minHeap)
            System.out.print(i+" ");
    }
}

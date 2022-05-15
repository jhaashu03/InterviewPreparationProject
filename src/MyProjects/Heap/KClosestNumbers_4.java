package MyProjects.Heap;

import java.util.*;

/*x=7;k=3
* arr[]     5   6   7   8   9
* arr-x     2   1   0   1   2   ---> abs value
*
* and consider k min value from arr-x for that use max heap
* */
public class KClosestNumbers_4 {
    public static void main(String args[])
    {
        int arr[] = {5,6,7,8,9};
        int n = arr.length;
        int x = 7, k = 3;
        printKclosest(arr, x, k, n);
    }

    private static void printKclosest(int[] arr, int x, int k, int n) {
        int i=0;
        PriorityQueue<Pair> maxHeap = new PriorityQueue<>(new Pair());
        for(i=0;i<n;i++){
            maxHeap.add(new Pair(arr[i],Math.abs(arr[i]-x)));
            if(maxHeap.size()>k)
                maxHeap.poll();
        }
        System.out.println("Heap");
        for(Pair i1: maxHeap){
            System.out.println(i1.key+" ");
        }

    }
}

class Pair implements Comparator<Pair> {
    int key;
    int value;

    Pair() {

    }

    Pair(int key, int value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public int compare(Pair p1, Pair p2) {
        if (p1.value == p2.value)
            return 0;     // no change
        if (p1.value < p2.value)
            return +1;   // change the order
        else
            return -1;  // no change
    }

}

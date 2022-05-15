package MyProjects.Heap;

import java.util.*;

public class TopKFrequentNumbers_5 {
    public static void main(String[] args)
    {
        //int arr[] = { 3, 1, 4, 4, 5, 2, 6, 1 };
        int arr[] = { 1,1,1,2,2,4 };
        int n = arr.length;
        int k = 2;
        
        print_N_mostFrequentNumber(arr, n, k);
    }

    private static void print_N_mostFrequentNumber(int[] arr, int n, int k) {
        Map<Integer,Integer> map= new HashMap<>();
        for(int element: arr){
            if(map.containsKey(element))
                map.put(element,map.get(element)+1);
            else
                map.put(element,1);
        }

        PriorityQueue<Pairs> minHeap = new PriorityQueue<>(new Pairs());

        for(Map.Entry i: map.entrySet()){
            minHeap.offer(new Pairs((int)i.getKey(),(int)i.getValue()));
            if(minHeap.size()>k)
                minHeap.poll();
        }

        while(!minHeap.isEmpty()){
            System.out.println(minHeap.poll().toString());
        }
    }
}

class Pairs implements Comparator<Pairs>
{
    int key;
    int value;
    Pairs(){}

    Pairs(int key, int val){
        this.key = key;
        this.value = val;
    }

    @Override
    public int compare(Pairs o1, Pairs o2) {
        Integer value1 = o1.value;
        Integer value2 = o2.value;
        return value1.compareTo(value2);
    }

    @Override
    public String toString() {
        return "Pairs{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
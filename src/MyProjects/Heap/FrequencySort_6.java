package MyProjects.Heap;

import java.util.*;

public class FrequencySort_6 {
    public static void main(String args[]){
        int arr[] = { 1,1,1,3,2,2,4,4,4,4 };
        int n = arr.length;
        int k = 2;

        frequentSort(arr, n, k);
    }

    private static void frequentSort(int[] arr, int n, int k) {
        PriorityQueue<MyPairs> maxHeap = new PriorityQueue<>(new MyPairs());
        Map<Integer,Integer> map= new HashMap<>();
        for(int element: arr){
            if(map.containsKey(element))
                map.put(element,map.get(element)+1);
            else
                map.put(element,1);
        }
        for(Map.Entry i: map.entrySet()){
            maxHeap.offer(new MyPairs((int)i.getKey(),(int)i.getValue()));
        }

        for(MyPairs p: maxHeap){
            //System.out.println(p.key+" "+p.value);
            for(int i=0;i<p.value;i++)
                System.out.print(p.key+", ");
            //minHeap.poll();
        }
    }
}

class MyPairs implements Comparator<MyPairs>
{
    int key;
    int value;
    MyPairs(){

    }

    MyPairs(int key, int val){
        this.key = key;
        this.value = val;
    }

    @Override
    public int compare(MyPairs o1, MyPairs o2) {
        Integer value1 = o1.value;
        Integer value2 = o2.value;
        return value2.compareTo(value1);
    }

    @Override
    public String toString() {
        return "Pairs{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

}

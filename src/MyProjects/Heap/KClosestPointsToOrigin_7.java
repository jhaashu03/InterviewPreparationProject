package MyProjects.Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KClosestPointsToOrigin_7 {
    public static void main (String[] args)
    {
        int points[][] = { { 3, 3 },
                { 5, -1 },
                { -2, 4 } };

        int K = 2;

        pClosest(points, K);
    }

    private static void pClosest(int[][] points, int k) {
        PriorityQueue<MyPairs1> maxHeap = new PriorityQueue<>(new MyPairs1());

        for(int[] row: points){
            String xy="";
            int dist=0;
            for(int col: row){
                dist += Math.pow(col,2);
                xy+=col+" ";
            }
            maxHeap.offer(new MyPairs1(dist,xy));
            if(maxHeap.size()>k)
                maxHeap.poll();
        }
        while(!maxHeap.isEmpty()){
            System.out.println(maxHeap.poll().xy);
        }
    }
}
class MyPairs1 implements Comparator<MyPairs1>
{
    int key;//store pow(x,2)+pow(y,2)
    String xy;
    MyPairs1(){

    }

    MyPairs1(int key, String xy){
        this.key = key;
        this.xy=xy;
    }

    @Override
    public int compare(MyPairs1 o1, MyPairs1 o2) {
        Integer value1 = o1.key;
        Integer value2 = o2.key;
        return value2.compareTo(value1);
    }

}


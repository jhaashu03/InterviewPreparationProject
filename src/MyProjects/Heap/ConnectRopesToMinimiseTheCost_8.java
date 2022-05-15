package MyProjects.Heap;

//https://www.geeksforgeeks.org/connect-n-ropes-minimum-cost/
/*
* put arr in minHeap first
* 2\ = 5(put the sum back in minHeap)
* 3/            4\
* 4        =>   5/=9    => 9\
* 6             6          6/=15
* ans=5     ans=5+9      ans=5+9+15 = 29
* */
import java.util.Comparator;
import java.util.PriorityQueue;

public class ConnectRopesToMinimiseTheCost_8 {
    public static void main(String args[])
    {
        int len[] = { 4,3,2,6 };
        int size = len.length;
        System.out.println("Total cost for connecting"
                + " ropes is " + minCost(len, size));
    }

    private static Integer minCost(int[] len, int size) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(Integer i: len)
            minHeap.offer(i);
        int ans=0;
        while(minHeap.size()>1){
            int x= minHeap.poll();
            int y = minHeap.poll();

            int sum = x+y;
            ans+=sum;
            System.out.println("x="+x+" y="+y+" sum="+sum);

            minHeap.offer(sum);
        }
        return ans;
    }
}

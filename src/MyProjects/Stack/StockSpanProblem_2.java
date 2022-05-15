//https://www.geeksforgeeks.org/the-stock-span-problem/

package MyProjects.Stack;

import java.util.*;

/*  0   1   2   3   4   5   6
-------------------------------
arr 100 80  60  70  60  75  85
-------------------------------

to find stock less than 85 it will be 85,75,60,70,60,80 i.e total 6

and nearest greater of 85(at index 6) is 100(at index 0) => 6-0 = 6

So in the list we are storing (arr ka index) - (NGE to left ka index)

* */


//The problem is same as finding nearest greater element to the left
public class StockSpanProblem_2 {
    public static void main(String[] args)
    {
        //int price[] = { 10, 4, 5, 90, 120, 80 };
        int price[] = {100, 80, 60, 70, 60, 75, 85};
        int n = price.length;
        List<Integer> l = new ArrayList<>();

        calculateSpan(price, n, l);

        for(Integer i: l)
            System.out.print(i+" ");
    }
    // same as nextGreaterElementToLeft
    private static void calculateSpan(int[] price, int n, List<Integer> l){
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<n;i++){
            if(s.isEmpty()){
                l.add(i-(-1));
            }
            if(!s.isEmpty() && price[s.peek()]>price[i]){
                //(arr ka index) - (NGE to left ka index)
                l.add(i-s.peek());
            }
            else if(!s.isEmpty() && price[s.peek()]<price[i]){
                while(!s.isEmpty() && price[s.peek()]<price[i]){
                    s.pop();
                }
                if(s.isEmpty())
                    l.add(i-(-1));
                else
                    l.add(i-s.peek());
            }
            //store only index in the stack
            s.push(i);
        }
    }
}

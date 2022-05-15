//https://www.geeksforgeeks.org/largest-rectangle-under-histogram/

package MyProjects.Stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/*
 See drawing and explain
Get two array Nearest smaller to right
And nearest smaller to left

width[] = NSR-NSL-1
Area = arr[i]*width[i]

        0   1   2   3   4   5   6    ---->Index
Arr[]   6   2   5   4   5   1   6
NSR     1   5   3   5   5   7   7
NSL     -1  -1  1   1   3   -1  5
width   1   5   1   3   1   7   1   -----> NSR-NSL-1
Area    6   10  5   12  5   7   6   -----> arr[i]*width[i]

Add pseudoIndex -1 in the begining as assume it's height is 0 --> for NSL
And add pseudoIndex n(in this case 7) in the last and assume it's height is 0 such that next smaller for atleast last element will be 7 --> for NSR

return max from area;
* */
public class MaximumAreaHistogram_3 {
    public static void main(String[] args)
    {
        int hist[] = { 6, 2, 5, 4, 5, 1, 6 };
        System.out.println("Maximum area is " + getMaxArea(hist, hist.length));
    }

    public static int getMaxArea(int[] arr, int length) {
        List<Integer> NSL = NSEToLeft(arr, length);
        List<Integer> NSR = NSEToRight(arr,length);

        List<Integer> width = new ArrayList<>();
        for(int i=0;i<length;i++){
            width.add(NSR.get(i)-NSL.get(i)-1);
        }
        List<Integer> area = new ArrayList<>();
        for(int i=0;i<length;i++){
            area.add(arr[i]*width.get(i));
        }
        return Collections.max(area);
    }

    //Next smaller element to the right --> List will have index instead of element
    private static List<Integer> NSEToRight(int[] arr, int n) {
        int pseudoIndex = n;
        List<Integer> l = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        for(int i=n-1;i>=0;i--){
            if(s.isEmpty()){
                l.add(pseudoIndex);
            }
            if(!s.isEmpty() && arr[s.peek()]<arr[i]){
                l.add(s.peek());
            }
            else if(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                    s.pop();
                }
                if(s.isEmpty())
                    l.add(pseudoIndex);
                else
                    l.add(s.peek());
            }
            //store only index in the stack
            s.push(i);
        }
        Collections.reverse(l);
        return l;
    }

    //Next smaller element to the left --> List will have index instead of element
    private static List<Integer> NSEToLeft(int[] arr, int n) {
        int pseudoIndex = -1;
        List<Integer> l = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<n;i++){
            if(s.isEmpty()){
                l.add(pseudoIndex);
            }
            if(!s.isEmpty() && arr[s.peek()]<arr[i]){
                l.add(s.peek());
            }
            else if(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                    s.pop();
                }
                if(s.isEmpty())
                    l.add(-1);
                else
                    l.add(s.peek());
            }
            //store only index in the stack
            s.push(i);
        }
        return l;
    }

}

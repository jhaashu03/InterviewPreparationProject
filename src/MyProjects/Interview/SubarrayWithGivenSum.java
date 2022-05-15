//https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1

/*Input:
N = 10, S = 15
A[] = {1,2,3,4,5,6,7,8,9,10}
Output: 1 5
Explanation: The sum of elements
from 1st position to 5th position
is 15.*/

package MyProjects.Interview;

import java.util.Deque;
import java.util.LinkedList;

public class SubarrayWithGivenSum {
    public static void main(String[] args)
    {
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        int n = a.length;
        int sum = 15;
        Deque max_sum = subarrayWithGivenSum(a, n,sum);
        int first =(Integer) max_sum.getFirst()+1;
        int last =(Integer) max_sum.getLast()+1;
        System.out.println("Index "
                + (last)+" "+first);
        System.out.println(max_sum);
    }

    private static Deque<Integer> subarrayWithGivenSum(int[] a, int n, int key) {
        Deque<Integer> d = new LinkedList();
        d.push(0);
        int sum=0;
        int i;
        for(i =1;i<n;i++){
            sum+=a[d.peek()];
            if(key-sum>=0){
                if(key-sum==0)
                    return d;
                d.push(i);
            }
            else{
                sum-=a[d.getLast()];
                d.removeLast();
                if(key-sum==0)
                    return d;
            }
        }
        if(i>n)
        {
            d.clear();
        }
        return d;
    }
}


//Lecture-1

/*for(int i=0;i<n;i++)
    for(int j=0;j<i;j++) ---> j is dependent of i

    ->time complexity = 0{n2)
    ->j is dependent of i i.e j is function of i

    agar aisa situation hai toh stack se banega
* */

package MyProjects.Stack;

import java.util.*;

/*
* if stack.isEmpty() == true ---> add -1 to list
*
* if stack.peek()> arr[i] ----> add that stack.peek() to the list
*
* if stack.peek()< arr[i]  keep popping element jb tk stack.peek() bara nhi mile*/

public class NextLargestElement_1 {
    public static void main(String args[]){
        //int[] arr = {13,7,6,12};
        int[] arr={100,80,60,70,60,75,85};
        nextGreaterElement(arr,arr.length);
        System.out.println();
        System.out.println("Next greater element to left");
        nextGreaterElementToLeft(arr,arr.length);
    }

    private static void nextGreaterElement(int[] arr, int length) {
        Stack<Integer> stack = new Stack();
        List<Integer> list = new ArrayList<>();

        for(int i=length-1;i>=0;i--){
            if(stack.isEmpty()){
                list.add(-1);
            }
            else if(stack.peek()>arr[i]){
                list.add(stack.peek());
            }
            else {
                while(!stack.isEmpty() && stack.peek()<arr[i]){
                    stack.pop();
                }
                if(stack.isEmpty())
                    list.add(-1);
                else
                    list.add(stack.peek());
            }
            stack.push(arr[i]);
        }

        Collections.reverse(list);
        for(Integer i: list)
            System.out.print(i+" ");
    }

    private static void nextGreaterElementToLeft(int[] arr, int length) {
        Stack<Integer> stack = new Stack();
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<length;i++){
            if(stack.isEmpty()){
                list.add(-1);
            }
            else if(stack.peek()>arr[i]){
                list.add(stack.peek());
            }
            else {
                while(!stack.isEmpty() && stack.peek()<arr[i]){
                    stack.pop();
                }
                if(stack.isEmpty())
                    list.add(-1);
                else
                    list.add(stack.peek());
            }
            stack.push(arr[i]);
        }

        for(Integer i: list)
            System.out.print(i+" ");
    }
}

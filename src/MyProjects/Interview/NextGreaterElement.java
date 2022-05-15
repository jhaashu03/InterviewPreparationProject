package MyProjects.Interview;

import java.util.Stack;

public class NextGreaterElement {
    public static void main(String args[]){
        int[] arr = {3, 9, 1, 2, 5, 11, 7, 2, 3, 8};
        printNGE(arr,arr.length);
    }

    private static void printNGE(int[] arr, int length) {
        Stack<Integer> s = new Stack();
        int element;
        s.push(arr[0]);
        for(int i=1;i<length;i++){
            if(!s.isEmpty()){
                element = s.pop();
                while(arr[i]>element){
                    System.out.println(element+"-->"+arr[i]);
                    if(s.isEmpty())
                        break;
                    element = s.pop();
                }
                if(element>arr[i]){
                    s.push(element);
                }
            }
            s.push(arr[i]);
        }
        while (s.isEmpty()==false){
            element = s.pop();
            System.out.println(element+"---"+"-1");
        }
    }
}

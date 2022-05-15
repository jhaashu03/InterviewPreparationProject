package MyProjects.Java8.LambdaExpression;

import java.util.Arrays;
import java.util.List;

public class LambdaExpression {
    public static void main(String args[]){
        List<Integer> l = Arrays.asList(2,3,4,5,6,7);

        for(int i : l){
            System.out.print(i+"|");
        }
        System.out.println();

        //LamdaExpersion Example-1
        l.forEach(i -> System.out.print(i+":"));
        System.out.println();

        //LamdaExpersion Example-2
        A a = ()-> System.out.println("Hello");

        a.show();



    }

    interface A{
        void show();
    }

    /*static class B implements A{
        public void show(){
            System.out.println("Hello");
        }
    }*/
}

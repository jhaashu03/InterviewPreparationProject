package MyProjects.Java8;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

//Predicate is used for conditional check
//Predicate<T> ----> return boolean
public class PredicateDemo {
    public  static void main(String args[]){

        //Accept one input parameter and always return boolean value
        Predicate<Integer> p1 = i->i%2==0;
        Predicate<Integer> p2 = i->i>25;

        int[] a ={10,15,25,30,35,40};

        for(int number: a){
            if(p1.test(number))
                System.out.println(number);
        }
        System.out.println("Number greater than");
        for(int number: a){
            if(p1.and(p2).test(number))
                System.out.println(number);
        }

        BiPredicate<Integer,Integer> bp = (i,j)->(i+j)%2==0;
        System.out.println(bp);
    }
}

package MyProjects.Java8;

import java.util.function.BiFunction;
import java.util.function.Function;

//Function<T,R> ----> R type return
public class FunctionDemo {
    public  static void main(String args[]){
        //function
        //accept one function and return type is R here int
        Function<Integer,Integer> f1 = i->i*i;
        Function<Integer,Integer> f2 = i->i*i*i;
        System.out.println(f1.andThen(f2).apply(2));

        String s= "Ashutosh";
        Function<String,Integer> f3 = i->i.length();
        System.out.print(f3.apply(s));

        //bifunction
        //accept two function and return type is R here int
        BiFunction<String,String,String> bf = (s1,s2)->""+s1.toUpperCase()+"-"+s2.toUpperCase();
        System.out.println(bf.apply("hello", "World"));
    }
}

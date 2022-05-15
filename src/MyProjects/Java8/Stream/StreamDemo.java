package MyProjects.Java8.Stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamDemo {
    public static void main(String args[]) {
        ArrayList<Integer> l = new ArrayList<>();
        ArrayList<Integer> l1 = new ArrayList<>();
        l.add(30);l.add(15);l.add(45);l.add(5);
        l.add(25);l.add(20);l.add(55);l.add(17);
        l.add(33);l.add(18);l.add(12);l.add(60);
        for(int i: l){
            if(i%2==0)
                l1.add(i);
        }
        System.out.println(l1);

        //print number form 1 to 10
        System.out.println("Printing umber between 1 to 10 range");
        IntStream.range(1,10).forEach(System.out::print);

        System.out.println("Even number between 1 to 10 range");
        IntStream.range(1,10).filter(i->i%2==0).forEach(System.out::print);

        //Method2 using stream
        List<Integer> l2=l.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(l2);

        //map
        List<Integer> l3=l.stream().map(i->i*i).collect(Collectors.toList());
        System.out.println(l3);

        //count method
        int countOfNumberLessThan20 = (int) l.stream().filter(i->i<20).count();
        System.out.println(countOfNumberLessThan20);

        //sorted(default sorting method)
        List<Integer> l4= l.stream().sorted().collect(Collectors.toList());
        System.out.println(l4);

        //sorted(comstamized sorting method)
        Comparator<Integer> c = (i1,i2)->i2.compareTo(i1);
        List<Integer> l5= l.stream().sorted(c).collect(Collectors.toList());
        System.out.println(l5);

        //min-always first element in sorted list or max-always last element in sorted list
        int min = l.stream().max(Comparator.naturalOrder()).get();
        System.out.println(min);

        l.stream().forEach(i->System.out.println(i*2));

        //reduce
        // To get the product of all elements
        // in given range excluding the
        // rightmost element
        int product  = IntStream.range(1, 5)
                .reduce(1,(num1, num2) -> num1 * num2);
        System.out.println("Product="+product);

    }
}

package MyProjects.Collections.InterviewQuestions.SortEmployeeClassBasedOnSalary;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.function.Predicate;

public class Main {
    public static void main(String args[]){
        Employee e1 = new Employee(1,"A","A1",100);
        Employee e2 = new Employee(2,"B","A2",500);
        Employee e3 = new Employee(3,"C","A3",200);
        Employee e4 = new Employee(4,"D","A4",600);
        Employee e5 = new Employee(5,"E","A5",300);

        //lambda experssion
        Comparator<Employee> c = (o1,o2)->(o1.id)>(o2.id)?1:(o1.id)<(o2.id)?-1:0;

        Predicate<String> sp = s->s.length()>2;
        System.out.println(sp.test("Ashu"));

        Comparator<Employee> cname = (o1,o2)->o2.name.compareTo(o1.name);


        SortedSet<Employee> ss = new TreeSet( cname);

        ss.add(e1);
        ss.add(e2);
        ss.add(e3);
        ss.add(e4);
        ss.add(e5);

        //Predicate
        Predicate<Employee> ep = e->e.salary>200;

        System.out.println(ss);
        for(Employee s :ss){
            if(ep.test(s))
                System.out.println(s);
        }
    }
}


//Predicate<String> sp = s->s.lenth
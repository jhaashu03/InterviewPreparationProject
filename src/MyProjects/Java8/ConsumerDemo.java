package MyProjects.Java8;

import MyProjects.Java8.Student.Student;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

//Consumer<T> ---> return void
public class ConsumerDemo {

    public  static void main(String args[]){

        //Accept one parameter and return is void
        Consumer<Student> c = s->System.out.println(s.name+" "+s.marks);
        Student s1 = new Student(1,"A","CSE,",80);
        Student s2 = new Student(4,"C","ISE,",60);
        Student s3 = new Student(2,"D","EEE,",90);
        Student s4 = new Student(3,"B","ECE,",70);

        ArrayList<Student> a = new ArrayList<>();
        a.add(s1);a.add(s2);a.add(s3);a.add(s4);
        for(Student s: a){
            c.accept(s);
        }
        //Accept two parameter and return is void
        BiConsumer<Student,Student> c1 = (ss1,ss2)->{if(ss1.marks>ss2.marks)
            c.accept(ss1);};
        BiConsumer<Student,Student> c2 = (ss1,ss2)->{};
    }
}

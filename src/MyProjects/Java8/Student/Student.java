package MyProjects.Java8.Student;

public class Student {
    public int id;
    public String name;
    public  String depName;
    public int marks;

    public Student(int id, String name, String depName, int salary){
        this.id = id;
        this.name = name;
        this.depName = depName;
        this.marks = salary;
    }

    public int getSalary() {
        return marks;
    }

    public String toString(){
        return  id+"-"+name+"-"+depName+"-"+marks;
    }
}

package MyProjects.Collections.InterviewQuestions.SortEmployeeClassBasedOnSalary;

public class Employee {
    public int id;
    public String name;
    public  String depName;
    public int salary;

    public Employee(int id, String name, String depName, int salary){
        this.id = id;
        this.name = name;
        this.depName = depName;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public String toString(){
        return  id+"-"+name+"-"+depName+"-"+salary;
    }
}

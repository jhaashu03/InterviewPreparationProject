package MyProjects.Collections.InterviewQuestions.SortEmployeeClassBasedOnSalary;

import java.util.Comparator;

public class MyComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        Integer salary1 = o1.getSalary();
        Integer salary2 = o2.getSalary();
        return  salary1.compareTo(salary2);
    }

}

package Section13;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee(1001,"Ralph",2015),
                new Employee(1005,"Carole",2021)));
        var comparator = new EmployeeComparator<>();
        employees.sort(comparator);

        for (Employee e : employees){
            System.out.println(e);
        }
    }
}

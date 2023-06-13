package Section7_8_OOPS.Constructors;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee = new Employee(2,"John");
        employee1.work();
        employee.work();
        Employee.setPhone(23);
        System.out.println(Employee.getPhone());

    }
}

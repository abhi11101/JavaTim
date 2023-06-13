package Section7_8_OOPS.Record;

public class Main {
    public static void main(String[] args) {
        LPAEmployee employee = new LPAEmployee(2,"John");
        System.out.println(employee);
        System.out.println("Id " + employee.id() + "\nName "+ employee.name());
    }
}

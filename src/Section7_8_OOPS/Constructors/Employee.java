package Section7_8_OOPS.Constructors;

public class Employee {
    private static int phone=1234;
    private int id=55;
    private String name="Dummy";

    public static int getPhone() {
        return phone;
    }

    public static void setPhone(int phone) {
        Employee.phone = phone;
    }

    public Employee(){
        this(29,"temp");
        System.out.println("Default Constructor");
    }

    public Employee(int id, String name){
        this.id=id;
        this.name=name;
        System.out.println("Parameterized Constructor");
    }

    public void work(){
        System.out.println("Is working");
        System.out.println("Id- "+ this.id + "\nName- " + this.name);
    }
}

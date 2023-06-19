package Section10.Enumeration;

public class Main {
    public static void main(String[] args) {

        DayOfTheWeek dayOfTheWeek = DayOfTheWeek.THU;
        System.out.println(dayOfTheWeek);

        System.out.printf("Name is %s, Ordinal value is %d",dayOfTheWeek.name(),dayOfTheWeek.ordinal());
    }
}

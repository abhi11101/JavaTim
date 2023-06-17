package Section7_8_OOPS.Encapsulation.Challenge;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50,true);
        System.out.println("Initial page count: "+ printer.getPagesPrinted());

        int pagesPrinted = printer.printPages(5);
        System.out.printf("Current Job pages %d, Total printed %d %n",pagesPrinted,printer.getPagesPrinted());
    }
}

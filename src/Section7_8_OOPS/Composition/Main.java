package Section7_8_OOPS.Composition;

public class Main {
    public static void main(String[] args) {
        ComputerCase computerCase =
                new ComputerCase("2208","Dell","240");
        Monitor monitor =
                new Monitor("27inch","Acer",27,"2540 x 1440");
        Motherboard motherboard =
                new Motherboard("BJ-200","ASUS",4,6,"v2.44");
        PersonalComputer pc =
                new PersonalComputer("2208","Dell",monitor,motherboard,computerCase);

//        pc.getMonitor().drawPixelAt(10,10,"red");
//        pc.getMotherboard().loadProgram("Windows OS");
//        pc.getComputerCase().pressPowerButton();

        pc.powerUp();
    }
}

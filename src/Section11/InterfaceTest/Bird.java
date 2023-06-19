package Section11.InterfaceTest;

public class Bird extends Animal implements FlightEnabled,Trackable{
    @Override
    public void move() {
        System.out.println("Flap Wings");
    }

    @Override
    public void takeOff() {
        System.out.println("Bird takeoff");
    }

    @Override
    public void land() {
        System.out.println("Bird lands");
    }

    @Override
    public void fly() {
        System.out.println("Bird fly");
    }

    @Override
    public void track() {
        System.out.println("Bird track");
    }
}

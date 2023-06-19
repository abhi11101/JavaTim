package Section11.InterfaceTest;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnabled flightEnabled =bird;
        Trackable trackable =bird;

//        animal.move();
//        flightEnabled.fly();
//        trackable.track();
        inFlight(flightEnabled);
    }

    private static void inFlight(FlightEnabled flier){
        flier.takeOff();
        flier.fly();
        if (flier instanceof Trackable tracked){
            tracked.track();
        }
        flier.land();
    }
}

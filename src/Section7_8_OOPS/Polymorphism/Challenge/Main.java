package Section7_8_OOPS.Polymorphism.Challenge;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Ferrari 458");
        runRace(car);

        Car ferrari = new GasPoweredCar("Ferrari 458",4,10);
        runRace(ferrari);

        Car tesla = new ElectricCar("Tesla Model S",25,175);
        runRace(tesla);

    }

    public static void runRace(Car car){
        car.startEngine();
        car.drive();
        System.out.println();
    }
}

package Section7_8_OOPS.Polymorphism.Challenge;

public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine(){
        System.out.println("Car -> Engine Start");
    }

    public void drive(){
        System.out.println("Driving " + getClass().getSimpleName());
        runEngine();
    }

    protected void runEngine(){
        System.out.println("Car -> Engine running");
    }
}

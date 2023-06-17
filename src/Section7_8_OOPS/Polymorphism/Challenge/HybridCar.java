package Section7_8_OOPS.Polymorphism.Challenge;

public class HybridCar extends Car{

    private double avgPerLiter;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description, double avgPerLiter, int batterySize, int cylinders) {
        super(description);
        this.avgPerLiter = avgPerLiter;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }
}

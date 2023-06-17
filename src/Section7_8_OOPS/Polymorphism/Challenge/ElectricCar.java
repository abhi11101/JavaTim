package Section7_8_OOPS.Polymorphism.Challenge;

public class ElectricCar extends Car{

    private double avgPerCharge;
    private int batterySize;

    public ElectricCar(String description, double avgPerCharge, int batterySize) {
        super(description);
        this.avgPerCharge = avgPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.println("Electric start engine with battery "+ batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.println("Electric engine running avg is "+ avgPerCharge);
    }
}

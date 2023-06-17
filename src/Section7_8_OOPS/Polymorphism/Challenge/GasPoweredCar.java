package Section7_8_OOPS.Polymorphism.Challenge;

public class GasPoweredCar extends Car{

    private double avgPerLitre;
    private int cylinder;

    public GasPoweredCar(String description, double avgPerLitre, int cylinder) {
        super(description);
        this.avgPerLitre = avgPerLitre;
        this.cylinder = cylinder;
    }

    @Override
    public void drive() {
        System.out.println("Driving Gas Powered Car");
    }

    @Override
    protected void runEngine() {
        System.out.println("Gas running engine");
    }
}

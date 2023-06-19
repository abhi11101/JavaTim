package Section11.Abstraction;

public class Fish extends Animal{
    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if (speed=="slow"){
            System.out.println(getExplicitType() + " slow swim");
        }else {
            System.out.println(getExplicitType() + " fast swim");
        }
    }

    @Override
    public void makeNoise() {
        if (type=="Goldfish"){
            System.out.println("swish");
        }else {
            System.out.println("Splash");
        }
    }
}

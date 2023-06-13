package Section7_8_OOPS.Introduction;

public class Car {

    private int door=1;
    private String model="Tesla";
    private String color="Red";
    private boolean convertible=false;

    public int getDoor() {
        return door;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public void describeCar(){
        System.out.println(door + " -Door " +
                color+ " -color "+
                model+ " -model "+
                convertible + " Convertible");
    }
}

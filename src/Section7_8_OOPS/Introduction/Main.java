package Section7_8_OOPS.Introduction;

public class Main {
    public static void main(String[] args) {
    Car car = new Car();
    car.describeCar();
    car.setDoor(4);
    car.setColor("Yellow");
    car.setModel("Diablo");
    car.setConvertible(true);

    System.out.println("Model- " + car.getModel() + "\nColor- "+ car.getColor()
    + "\nDoors- "+ car.getDoor() + "\nConvertible " + car.isConvertible());
    }

}

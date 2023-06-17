package Section7_8_OOPS.Composition.Challenge;

public class CoffeeMaker {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee(){
        if (hasWorkToDo)
            System.out.println("Coffee making..");
    }
}

package Section7_8_OOPS.Composition.Challenge;

public class DishWasher {

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes(){
        if (hasWorkToDo)
            System.out.println("Doing dishes");
    }
}

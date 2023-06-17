package Section7_8_OOPS.Composition.Challenge;

public class Main {
    public static void main(String[] args) {

        KitchenApplication kc = new KitchenApplication();

//        kc.getRefrigerator().setHasWorkToDo(true);
//        kc.getDishWasher().setHasWorkToDo(true);
//        kc.getCoffeeMaker().setHasWorkToDo(true);
//        kc.getCoffeeMaker().brewCoffee();
//        kc.getDishWasher().doDishes();
//        kc.getRefrigerator().orderFood();

        kc.setKitchenState(true,true,true);
        kc.doKitchenWork();
    }
}

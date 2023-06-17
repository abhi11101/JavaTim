package Section7_8_OOPS.Composition.Challenge;

public class KitchenApplication {

    private Refrigerator refrigerator;
    private DishWasher dishWasher;
    private CoffeeMaker coffeeMaker;

    public KitchenApplication() {
        refrigerator = new Refrigerator();
        dishWasher = new DishWasher();
        coffeeMaker = new CoffeeMaker();
    }

    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag, boolean dishWAsherFlag){
        refrigerator.setHasWorkToDo(fridgeFlag);
        coffeeMaker.setHasWorkToDo(coffeeFlag);
        dishWasher.setHasWorkToDo(dishWAsherFlag);
    }

    public void doKitchenWork(){
        refrigerator.orderFood();
        coffeeMaker.brewCoffee();
        dishWasher.doDishes();
    }
//    public Refrigerator getRefrigerator() {
//        return refrigerator;
//    }
//
//    public DishWasher getDishWasher() {
//        return dishWasher;
//    }
//
//    public CoffeeMaker getCoffeeMaker() {
//        return coffeeMaker;
//    }
}

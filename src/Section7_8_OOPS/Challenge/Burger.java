package Section7_8_OOPS.Challenge;

import java.util.Scanner;

public class Burger extends Item{

   private Item extra1;
   private Item extra2;
   private Item extra3;

    public Burger(String name, double price) {
        super(name, "Burger", price);
    }

    @Override
    public String getName() {
        return super.getName() + " BURGER";
    }

    @Override
    public double getAdjustedPrice() {
        return getBasePrice() +
                ((extra1 ==null) ? 0 : extra1.getAdjustedPrice()) +
                ((extra2==null) ? 0 : extra2.getAdjustedPrice()) +
                ((extra3==null)? 0: extra3.getAdjustedPrice());
    }

    public double getExtraPrice(String topping){
        return switch (topping.toUpperCase()){
          case "AVOCADO", "CHESSE"-> 80;
          case "SALAMI" ->150;
            default -> 0;
        };
    }

    public void addToppings(String extra1, String extra2, String extra3){
        this.extra1=new Item("TOPPING",extra1,getExtraPrice(extra1));
        this.extra2=new Item("TOPPING",extra2,getExtraPrice(extra2));
        this.extra3=new Item("TOPPING",extra3,getExtraPrice(extra3));
    }
}

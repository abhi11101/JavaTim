package Section7_8_OOPS.Encapsulation;

public class Player {

    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        health-=damage;
        if (health<=0){
            System.out.println("Player knocker out of game");
            health=0;
        }
    }

    public void restoreHealth(int extraHealth){
        health+=extraHealth;
        if (health>100){
            System.out.println("Health restored to 100%");
            health=100;
        }
    }

    public int healthRemaining(){
        return health;
    }
}
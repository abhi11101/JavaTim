package Section7_8_OOPS.Encapsulation;

public class EnhancedPlayer {

    private String name;
    private int health;
    private String weapon;

    public EnhancedPlayer(String name) {
        this(name,100,"Sword");
    }

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if (health <=0){
            this.health = 0;
        } else if (health>100) {
            this.health=100;
        }else {
            this.health=health;
        }
        this.weapon = weapon;
    }

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

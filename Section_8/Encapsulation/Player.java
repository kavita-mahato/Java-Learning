package Encapsulation;

public class Player {
    public String fullName;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        health -= damage;
        if(health <= 0){
            System.out.println("Out");
        }
    }
    public int healthRemaining(){
        return health;
    }
    public void restoreHealth(int extraHealth){
        health += extraHealth;
        if(health > 100){
            System.out.println("Restored");
            health = 100;
        }
    }
}

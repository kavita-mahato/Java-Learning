package Encapsulation;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n");
        // Player player = new Player();
        // player.fullName = "Kavita";
        // player.health = 20;
        // player.weapon = "Sword";

        // int damage = 10;
        // player.loseHealth(damage);
        // System.out.println("Remaining health : " + player.healthRemaining());
        // player.health = 200;
        // player.loseHealth(11);
        // System.out.println("Remaining health : " + player.healthRemaining());
        EnhancePlayer kavita = new EnhancePlayer("Kavita", 200, "Sword");
        System.out.println("Initial health is : " + kavita.healthRemaining());
    }
}

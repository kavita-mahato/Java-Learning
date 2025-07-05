package Polymorphism.Burger;

public class Main {
    public static void main(String[] args) {
        System.out.println(" ");
        Item coke = new Item("drink", "coke", 1.50);
        coke.printItem();
        coke.setSize("LARGE");
        coke.printItem();

        Item avocado = new Item("Topping", "avocado", 1.50);
        avocado.printItem();
    }
}

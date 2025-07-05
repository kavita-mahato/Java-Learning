package Polymorphism.Burger;

public class Main {
    public static void main(String[] args) {
        System.out.println(" ");
        // Item coke = new Item("drink", "coke", 1.50);
        // coke.printItem();
        // coke.setSize("LARGE");
        // coke.printItem();

        // Item avocado = new Item("Topping", "avocado", 1.50);
        // avocado.printItem();

    //    Burger burger = new Burger("regular", 4.00);
    //    burger.addToppings("BACON", "CHEESE", "MAYO");
    //    burger.printItem();     
    
       MealOrder regularMeal = new MealOrder();
       regularMeal.addBurgerToppings("BACON", "CHEESE", "MAYO");
       regularMeal.setDrinkSize("LARGE");
       regularMeal.printItemizedList();
    }
}

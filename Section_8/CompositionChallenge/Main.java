public class Main {
    public static void main(String[] args) {
        System.out.println("\n");
        SmartKitchen kitchen = new SmartKitchen();

        // kitchen.getBrewMaster().setHasWorkToDo(true);
        // kitchen.getIceBox().setHasWorkToDo(true);
        // kitchen.getDishWasher().setHasWorkToDo(true);

        // kitchen.getBrewMaster().brewCoffee();
        // kitchen.getIceBox().orderFood();
        // kitchen.getDishWasher().doDishes();

        kitchen.setKitchenState(true, false, true);
        kitchen.doKitchenWork();
    }
}

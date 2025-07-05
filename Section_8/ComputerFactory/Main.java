package ComputerFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n");
        ComputerCase theCase = new ComputerCase("2232", "Dell","240");
        Monitor theMonitor = new Monitor("27 inch Beast", "Acer", 27, "2540 x 1440");
        Motherboard theMotherboard = new Motherboard("BJ-2232", "ASUS", 4, 5, "v2.44");
        PersonalComputer thePC = new PersonalComputer("2232","Dell", theCase, theMonitor, theMotherboard);

        // thePC.getMonitor().drawPixelAt(10, 10, "red");
        // thePC.getMotherboard().loadProgram("Windows OS");
        // thePC.getComputerCase().pressPowerButton();

        thePC.powerUp();
    }
}

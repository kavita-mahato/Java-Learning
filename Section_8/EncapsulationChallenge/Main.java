package Section_8.EncapsulationChallenge;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n");
        Printer printer = new Printer(50, true);
        System.out.println("Page count = " + printer.getPagesPrinted());
        
        int pagesPrinted = printer.printPages(5);
        System.out.printf("Current Job pages : %d printer total : %d %n", pagesPrinted, printer.getPagesPrinted());
        
    }
}

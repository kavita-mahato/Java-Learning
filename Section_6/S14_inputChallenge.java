package Section_6;

import java.util.Scanner;

public class S14_inputChallenge {
    public static void main(String[] args) {
        System.out.println("\n");

        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        double sum = 0;
        do {
            System.out.println("Enter number #" + counter + ":");
            String nextNumber = scanner.nextLine();
            try {
                // int number = Integer.parseInt(nextNumber);
                double number = Double.parseDouble(nextNumber);
                counter++;
                sum += number;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid number");
            }
        } while (counter <= 5);

        System.out.println("The sum of the 5 numbers = " + sum);
        scanner.close();
    }
}

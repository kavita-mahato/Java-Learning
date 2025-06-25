package Section_6;

import java.util.Scanner;

public class S12_scanner {
    public static void main(String[] args) {
        System.out.println("\n");

        int currentYear = 2025;
        try{
            System.out.println(getInputFromConsole(currentYear));
        }catch (NullPointerException e){
            System.out.println(getInputFromScanner(currentYear));
        }
    }
    public static String getInputFromConsole(int currentYear) {
          String name = System.console().readLine("Hi, What's your Name? ");   // Taking inputs
          System.out.println("Hi " + name + ", Thanks for taking the course!");  // Printing the taken inputs

          String dateOfBirth = System.console().readLine("What year were you born? ");   // Taking inputs
          int age = currentYear - Integer.parseInt(dateOfBirth);      // Calculating the age as per the user inputs
          return "So you are " + age + " years old";   // Printing the taken inputs
    }
    public static String getInputFromScanner(int currentYear) {
          Scanner scanner = new Scanner(System.in);

     // String name = System.console().readLine("Hi, What's your Name? ");
          System.out.println("Hi, What's your Name? ");
          String name = scanner.nextLine();
          System.out.println("Hi " + name + ", Thanks for taking the course!");
 
     // String dateOfBirth = System.console().readLine("What year were you born? ");
          System.out.println("What year were you born? ");
          String dateOfBirth = scanner.nextLine();
          scanner.close();    // closing the Scanner class

          int age = currentYear - Integer.parseInt(dateOfBirth);
          return "So you are " + age + " years old";
     }
}

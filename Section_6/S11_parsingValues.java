package Section_6;

public class S11_parsingValues {
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
          System.out.println("Hi " + name + ", Thanks for taking the course!");
          String dateOfBirth = System.console().readLine("What year were you born? ");   // Taking inputs
          int age = currentYear - Integer.parseInt(dateOfBirth);  
          return "So you are " + age + " years old";
    }
    public static String getInputFromScanner(int currentYear) {
          return "";
    }
}

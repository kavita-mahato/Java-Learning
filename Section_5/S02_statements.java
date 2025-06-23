package Section_5;

public class S02_statements {
    public static void main(String[] args) {
        int myVariable = 50;
        myVariable++;
        myVariable--;
        System.out.println("\nThis is a test");
        System.out.println("This is"
                + " another" +
                " Still more ");

        int anotherVariable = 50;
        myVariable--;
        System.out.println("anotherVariable " + anotherVariable);

        if(myVariable ==0){
            System.out.println("It's now zero.");
        }

    }
}

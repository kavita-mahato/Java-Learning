package Section_5;

public class S03_if_then_else {
    public static void main(String[] args) {
        System.err.println("\n");
        // boolean gameOver = true;
        int score = 500;
        // int levelCompleted = 5;
        // int bonus = 100;

        if (score <= 5000 && score >1000){
            System.out.println("Your score is less than or equal to 5000");
        }else if (score<1000){
            System.err.println("Your score is less than 1000");
        }
        else{
            System.err.println("Your score is greater then 5000");
        }
    }
}

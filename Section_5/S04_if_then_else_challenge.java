package Section_5;

public class S04_if_then_else_challenge {
    public static void main(String[] args) {
        System.err.println("\n");
        boolean gameOver = true;
        int score = 500;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;
        if (gameOver == true) {
            finalScore += (levelCompleted * bonus);
            System.err.println("Your final score is " + finalScore);
        }
        // boolean newGameOver = true;
        // int newScore = 10000;
        // int newLevelCompleted = 8;
        // int newBonus = 200;

        // int newFinalScore = newScore;

        // if (newGameOver == true) {
        //     newFinalScore += (newLevelCompleted * newBonus);
        //     System.err.println("Your final score is " + newFinalScore);
        // }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        finalScore = score;
        if (gameOver == true) {
            finalScore += (levelCompleted * bonus);
            System.err.println("Your final score is " + finalScore);
        }
    }
}

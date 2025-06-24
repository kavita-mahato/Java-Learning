package Section_5;

public class S05_methods {
    public static void main(String[] args) {
        System.err.println("\n");
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;
        calculateScore(true, 800, levelCompleted, bonus);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        finalScore = score;
        if (gameOver == true) {
            finalScore += (levelCompleted * bonus);
            System.err.println("Your final score is " + finalScore);
        }
    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.err.println("Your final score is " + finalScore);
        }
    }
}

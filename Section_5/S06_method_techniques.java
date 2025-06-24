package Section_5;

public class S06_method_techniques {
    public static void main(String[] args) {
        System.err.println("\n");
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.err.println("The high score is " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        System.err.println("The next high score is " + calculateScore(gameOver, score, levelCompleted, bonus));

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }
        return finalScore;
    }
}

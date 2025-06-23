package Section_5;

public class S01_keyword_expressions {
    public static void main(String[] args) {
        double kilometers = (100 * 1.609344);
        System.out.println("\nDistance " + kilometers);

        int highScore = 50;
        if (highScore > 25) {
            highScore = 1000 + highScore;
        }
        System.out.println("Score " + highScore);

        int health = 100;
        if ((health < 25) && (highScore > 1000)){
            highScore = highScore - 1000;
        }
        System.out.println("Health " + highScore);
    }
}

package Section_5;

public class S07_methodChallenge {
    public static void main(String[] args) {
        System.err.println("\n");
        int pos = calculateHighScorePosition(499);
        displayHighScorePosition("Kavita", pos);
    }

    public static void displayHighScorePosition(String name, int position) {
        System.err.println(name + " managed to get into position " + position + " on the high score list.");
    }

    public static int calculateHighScorePosition(int score) {
        int position = 4;
        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }
        return position;
    }
}

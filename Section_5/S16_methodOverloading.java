package Section_5;

public class S16_methodOverloading {
    public static void main(String[] args) {
        System.out.println("\n");

        int newScore = calculateScore(10);
        System.out.println(newScore);
        ;System.out.println(calculateScore(50));
    }
    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score*1000;

    } 
    public static int calculateScore(int score){
        return calculateScore("Anonymous", score);

    } 
    public static int calculateScore(){
        System.out.println("No player");
        return 0;

    }  
}

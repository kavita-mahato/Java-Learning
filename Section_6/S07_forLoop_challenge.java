package Section_6;

public class S07_forLoop_challenge {
    public static void main(String[] args) {
        System.out.println("\n");

        int countOfMatches = 0;
        int sumOfMatches = 0;

        for (int loopNumber = 1; loopNumber <= 1000; loopNumber++) {
            if ((loopNumber % 3 == 0) && (loopNumber % 5 == 0)) {
                countOfMatches++;
                sumOfMatches += loopNumber;
                System.out.println("Found a match = " + loopNumber);
            }
            if (countOfMatches == 5) {
                break;
            }
        }
        System.out.println("Sum = " + sumOfMatches);
    }
}

package Section_6;

public class S08_while {
    public static void main(String[] args) {
        System.out.println("\n");

        //do while
        // int j = 1;
        // boolean isReady = false;
        // do {
        //     if (j > 5) {
        //         break;
        //     }
        //     System.out.println(j);
        //     j++;
        //     isReady = (j > 0);
        // } while (isReady);

        //while
        int number = 0;
        while (number < 50) {
            number += 5;
            if (number % 25 == 0) {
                continue;
            }
            System.out.print(number + "_");
        }
    }
}

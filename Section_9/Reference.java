package Section_9;

import java.util.Arrays;

public class Reference {
    public static void main(String[] args) {
        System.out.println("\n");

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;
        modifyArray(myIntArray);

        System.out.println("after change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after change anotherArray = " + Arrays.toString(anotherArray));
    }
    private static void modifyArray(int[] array) {
        array[1] = 2;
    }
}

/*
We have a dog that likes to bark.  We need to wake up if the dog is barking at night!
Write a method shouldWakeUp that has 2 parameters.
1st parameter should be of type boolean and be named barking it represents if our dog is currently barking.
2nd parameter represents the hour of the day and is of type int with the name hourOfDay and has a valid range of 0-23.

We have to wake up if the dog is barking before 8 or after 22 hours so in that case return true.
In all other cases return false.
If the hourOfDay parameter is less than 0 or greater than 23 return false.
*/

package Section_5;

import java.util.Scanner;

public class S11_challenge04 {
    public static void main(String[] args) {
        System.out.println("\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of hours: ");
        int hours = sc.nextInt();
        System.out.print("Is the dog barking? ");
        boolean barking = sc.nextBoolean();

        if (shouldWakeUp(barking, hours)) {
            System.out.println("Wake up");
        } else {
            System.out.println("Relax");
        }
        sc.close();
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else {
            return (barking && (hourOfDay < 8 || hourOfDay >= 23));
        }
    }
}

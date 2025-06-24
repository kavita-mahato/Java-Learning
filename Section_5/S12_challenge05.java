/*
Write a method isLeapYear with a parameter of type int named year.
The parameter needs to be greater than or equal to 1 and less than or equal to 9999. If the parameter is not in that range return false.
Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is a leap year, otherwise return false.

To determine whether a year is a leap year, follow these steps: 
1. If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
2. If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
3. If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
4. The year is a leap year (it has 366 days). The method isLeapYear needs to return true.
5. The year is not a leap year (it has 365 days). The method isLeapYear needs to return false.

Another way to put is:
A leap year is a year that is divisible by 4 but not 100.
If it's divisible by 100, it has to be divisible by 400.
*/

package Section_5;

import java.util.Scanner;

public class S12_challenge05 {
    public static void main(String[] args) {
        System.out.println("\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number you need to check: ");
        int year = sc.nextInt();

        if (isLeapYear(year)) {
            System.out.println("This is a leap year!");
        } else {
            System.out.println("This is not a leap year!");
        }
        sc.close();
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else {
            if (year % 4 == 0 && year % 100 != 0) {
                return true;
            } else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
                return true;
            }
            return false;

        }
    }
}

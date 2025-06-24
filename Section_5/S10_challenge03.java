/* 
Accurate MegaBytes Converter For Mastering Integer Math In Java
Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type int with the name kiloBytes.
The method should not return anything (void) and it needs to calculate the megabytes and remaining kilobytes from the kilobytes parameter.

Then it needs to print a message in the format "XX KB = YY MB and ZZ KB".
XX represents the original value kiloBytes.
YY represents the calculated megabytes.
ZZ represents the calculated remaining kilobytes.

For example, when the parameter kiloBytes is 2500 it needs to print "2500 KB = 2 MB and 452 KB"
If the parameter kiloBytes is less than 0 then print the text "Invalid Value"
*/

package Section_5;

import java.util.Scanner;

public class S10_challenge03 {
    public static void main(String[] args) {
        System.out.println("\n");
        Scanner sc = new Scanner(System.in);
          System.out.print("Enter KB: ");
          int kb = sc.nextInt();
          printMegaBytesAndKiloBytes(kb);
          sc.close();
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            long megaBytes = kiloBytes / 1024;
            long remainder = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainder + " KB");
        }
    }
}

/*
Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.
*/

package Section_5;

public class S13_challenge06 {
    public static void main(String[] args) {
        System.out.println("\n");
        boolean isTrue = areEqualByThreeDecimalPlaces(2.012, 2.012);
        System.out.println(isTrue);
    }
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        long a = (long)(num1 * 1000);
        long b = (long)(num2 * 1000);
        return (a == b);
    }
}

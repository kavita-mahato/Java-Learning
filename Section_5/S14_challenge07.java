/*
Write a method hasEqualSum with 3 parameters of type int.
The method should return boolean and it needs to return true if the sum of the first and second parameter is equal to the third parameter. Otherwise, return false.
*/

package Section_5;

public class S14_challenge07 {
    public static void main(String[] args) {
        System.out.println("\n");
        System.out.println(hasEqualSum(3, 3, 6));
    }
    public static boolean hasEqualSum(int num1, int num2, int num3){
        return (num1 + num2) == num3 ;
    }
}

package Section_5;

public class S09_challenge02 {
    public static void main(String[] args) {
        System.out.println("\n");
        System.out.println(toMilesPerHour(42.2));
        printConversion(42.2);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            double miles = kilometersPerHour / 1.609;
            return Math.round(miles);
        }
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long miles = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + miles + " mi/h");
        }
    }
}

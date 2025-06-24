package Section_5;

public class S18_timeBasedCalculation {
    public static void main(String[] args) {
        System.err.println("\n");
        System.err.println(getDurationString(3456));
        System.out.println(getDurationString(65, 45));

    }

    public static String getDurationString(int seconds) {
    
        int minutes = seconds / 60;
        return getDurationString(minutes,seconds );

    }

    public static String getDurationString(int minutes, int seconds) {
        int hours = minutes / 60;

        int remMin = minutes % 60;
        int remSec = seconds % 60;
        return hours + "h " + remMin + "m " + remSec + "s";

    }
}

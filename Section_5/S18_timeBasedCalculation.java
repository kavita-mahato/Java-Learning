package Section_5;

public class S18_timeBasedCalculation {
    public static void main(String[] args) {
        System.err.println("\n");
        System.err.println(getDurationString(3945));
        System.out.println(getDurationString(65, 45));

    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid data";
        }
        return getDurationString(seconds / 60, seconds%60);

    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0) {
            return "Invalid data";
        }
        if (seconds < 0 || seconds > 59) {
            return "Invalid data";
        }
        int hours = minutes / 60;

        int remMin = minutes % 60;
        return hours + "h " + remMin + "m " + seconds + "s";

    }
}

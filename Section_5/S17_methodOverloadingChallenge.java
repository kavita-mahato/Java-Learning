package Section_5;

public class S17_methodOverloadingChallenge {
    public static void main(String[] args) {
        System.out.println("\n");
        System.out.println(convertToCenti(5, 6));
    }
    public static double convertToCenti(int inches){
        return inches * 2.54;
    }
    public static double convertToCenti(int feet,int inches){
        int totalInches = (feet * 12) + inches;
        double result = convertToCenti(totalInches);
        return result;
    }
}

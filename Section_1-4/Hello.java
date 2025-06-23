public class Hello {
    public static void main(String[] args) {
        // System.out.println("Hello");
        // int topscore = 80;
        // int secondtopscore = 70;
        // if (topscore > 60 || secondtopscore>60) {
        //     System.out.println("EIther or both greater than 60");
        // }

        String car = "Volkswagen";
        boolean isDomestic = car == "Volkswagen" ? false : true;
        if(isDomestic){
            System.out.println("This car is domestic to our country");
        }

        String s = (isDomestic)?"This is domestic":"this car is not domestic";
        System.out.println(s);

        double num1 = 20.00;
        double num2 = 80.00;
        double num3 = (num1 + num2) * 100.00d;
        System.out.println("num3 : " + num3);
        double rem = num3%40.00;
        System.out.println("remainder : " + rem);
        boolean isnorem = (rem==0)? true : false;
        System.out.println("isnorem = "+ isnorem);
        if(!isnorem){
        System.out.println("Got some remainder");
        }
    }    
}

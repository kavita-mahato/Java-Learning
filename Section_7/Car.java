package Section_7;

public class Car {
    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean convertible;
    public void describeCar(){
        System.out.println(doors + "-Door" +
        color + " " +
        make + " " +
        (convertible ? "Convertible" : " "));
    }
}

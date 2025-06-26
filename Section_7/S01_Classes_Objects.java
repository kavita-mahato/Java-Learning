package Section_7;

public class S01_Classes_Objects {
    public static void main(String[] args) {
        System.out.println("\n");
        
        Car car = new Car();
        // car.make = "Porsche";
        // car.model = "Carrera";
        // car.color = "Black";
        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        car.describeCar();
    }
}

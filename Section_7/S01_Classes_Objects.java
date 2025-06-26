package Section_7;

public class S01_Classes_Objects {
    public static void main(String[] args) {
        System.out.println("\n");
        
        Car car = new Car();
        car.setMake("Porsche");
        car.setModel("Carrera");
        car.setColor("Black");
        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        car.describeCar();

        Car targa = new Car();
        targa.setMake("Porsche");
        targa.setModel("Carrera");
        targa.setColor("Black");
        targa.describeCar();
    }
}

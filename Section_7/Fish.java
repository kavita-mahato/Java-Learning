package Section_7;

public class Fish extends Animal{
    private int gills;
    private int fins;
    public Fish (String type, double weight, int gills, int fins){
        super(type, "small", weight);
        this.gills = gills;
        this.fins = fins;
    }

    private void moveMuscles(){
        System.out.println("Muscles moving");
    }
    private void moveBackFin(){
        System.out.println("BackFin moving");
    }
    public void move(String speed){
        super.move(speed);
        moveMuscles();
        if(speed == "fast"){
            moveBackFin();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Fish [gills=" + gills + ", fins=" + fins + ", toString()=" + super.toString() + "]";
    }
    
}

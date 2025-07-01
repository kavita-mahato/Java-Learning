package Section_7;

public class S07_inheritanceBasics {
    public static void main(String[] args) {
        System.out.println("\n");
        Animal animal = new Animal("Generic Animal", "Huge", 40);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");

        Dog yorkie = new Dog("Yorkie",15);
        doAnimalStuff(yorkie, "fast");
        Dog retriever = new Dog("Retriever", 50,"Floopy","Swimmer");
        doAnimalStuff(retriever, "slow");
    }
    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _ _");
    }
}

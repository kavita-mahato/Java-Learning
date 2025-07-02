package Section_7;

public class S08_unveilingJava extends Object{
    public static void main(String[] args) {
        System.out.println("\n");
        Students kavita = new Students("Kavita",20);
        System.out.println(kavita.toString());

        PrimarySchoolStudent anirban = new PrimarySchoolStudent("Anirban", 10, "Sandeep");
        System.out.println(anirban);
    }
}
class Students{
    private String name;
    private int age;

    Students(String name, int age){
        this.name = name;
        this.age = age;    
    }

    @Override
    public String toString() {
        return name + ", age=" + age;
    }
    // public String toString(){
    //     return super.toString();
    // }

}
class PrimarySchoolStudent extends Students{
    private String parentName;

    PrimarySchoolStudent(String name, int age, String parentName){
        super(name, age);
        this.parentName = parentName;
    }
    public String toString(){
        return parentName + "'s kid, " + super.toString();
    }
}
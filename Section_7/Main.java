package Section_7;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n");
        for(int i = 1; i<= 5; i++){
        LPAStudent s = new LPAStudent("592300" + i,
        switch(i){
            case 1 -> "Kavita";
            case 2 -> "Antara";
            case 3 -> "Bhagya";
            case 4 -> "Nahida";
            case 5 -> "Priyanka";
            default -> "Anonymous";
        },
        "05/11/2000",
        "Java");
    System.out.println(s);
    }
    Student pojoStudent = new Student ("5923006", "Ann","05/11/2000", "Java");
    LPAStudent recordStudent = new LPAStudent("5923007", "Bill", "05/11/2001", "JAVA");
  
    pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
    // recordStudent.classList(recordStudent.classList() + ", Java OCP Exam 829");

    System.out.println(pojoStudent.getName() + " is taking "+ pojoStudent.getClassList());
    System.out.println(recordStudent.name() + " is taking "+ recordStudent.classList());
    }
}

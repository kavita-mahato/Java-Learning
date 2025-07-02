package Section_7;

public class S09_workerChallenge {
    public static void main(String[] args) {
        Employee kavita = new Employee("Kavita", "01/01/2000","25/11/25");
        System.out.println(kavita);
        System.out.println("Age = " + kavita.getAge());
        System.out.println("Pay = " + kavita.collectPay());

        Employee antara = new Employee("Kavita", "11/11/1111", "03/03/2020");
        System.out.println(antara);
    }
}

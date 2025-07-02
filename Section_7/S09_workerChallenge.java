package Section_7;

public class S09_workerChallenge {
    public static void main(String[] args) {
        Employee kavita = new Employee("Kavita", "01/01/2000","25/11/25");
        System.out.println(kavita);
        System.out.println("Age = " + kavita.getAge());
        System.out.println("Pay = " + kavita.collectPay());

        SalariedEmployee antara = new SalariedEmployee("Kavita", "11/11/1111", "03/03/2020",35000);
        System.out.println(antara);
        System.out.println("Antara's paycheck = $" + antara.collectPay());
        antara.retire();
        System.out.println("Antara's Pension check = $"+ antara.collectPay());
        
        HourlyEmployee mary = new HourlyEmployee("Mary", "05/05/1970", "03/03/2021", 15);
        System.out.println(mary);
        System.out.println("Mary's Paycheck = $" + mary.collectPay());
        System.out.println("Mary's Holiday pay = $" + mary.getDoublePay());
    }
}

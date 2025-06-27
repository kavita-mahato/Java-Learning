package Section_7;

public class S03_constructors {
    public static void main(String[] args) {
        System.out.println("\n");

        Account kaviAccount = new Account("12345",500.0,"Kavita Mahato","kavitamahato123@gmail.com","987654321");
        // kaviAccount.setBalance(1000);
        // kaviAccount.setCustomerName("Kavita");
        // kaviAccount.setCustomerPhone("987654321");

        kaviAccount.depositFunds(500.0);
        kaviAccount.withdrawFunds(100.0);
    }
}

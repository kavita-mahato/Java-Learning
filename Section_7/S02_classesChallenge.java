package Section_7;

public class S02_classesChallenge {
    public static void main(String[] args) {
        System.out.println("\n");

        Account kaviAccount = new Account();
        kaviAccount.setBalance(1000);
        kaviAccount.setCustomerName("Kavita");
        kaviAccount.setCustomerPhone("987654321");

        kaviAccount.depositFunds(500.0);
        kaviAccount.withdrawFunds(100.0);
    }
}

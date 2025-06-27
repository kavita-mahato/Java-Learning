package Section_7;

public class S04_constructorChaining {
    public static void main(String[] args) {
        System.out.println("\n");

        // Account kaviAccount = new Account("12345",500.0,"Kavita Mahato","kavitamahato123@gmail.com","987654321");

        Account kaviAccount = new Account();
        kaviAccount.depositFunds(500.0);
        kaviAccount.withdrawFunds(100.0);

        Account aniAccount = new Account("Anirban", "anirban12@gmail.com", "987654321");
        System.out.println("Account no. "+ aniAccount.getNumber() + " Name : "+aniAccount.getCustomerName());
    }
}

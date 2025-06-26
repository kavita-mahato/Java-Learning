package Section_7;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public void depositFunds(double depositAmount){
        balance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " made. New balnce is $" + this.balance);
    }
    public void withdrawFunds(double withdrawAmount){
        if (withdrawAmount > this.balance){
            System.out.println("Insufficient amount!" + " only $"+ this.balance + " is available.");
        }else{
            balance -= withdrawAmount;
            System.out.println("withdrawal of $" + withdrawAmount + " made. New balnce is $" + this.balance);
        }
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerEmail() {
        return customerEmail;
    }
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
    public String getCustomerPhone() {
        return customerPhone;
    }
    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }


}

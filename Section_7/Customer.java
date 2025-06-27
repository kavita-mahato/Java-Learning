package Section_7;

public class Customer {
    private String name ;
    private double creditLimit;
    private String email ;
    
    public String getName() {
        return name;
    }
    public double getCreditLimit() {
        return creditLimit;
    }
    public String getEmail() {
        return email;
    }
    
    public Customer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public Customer(){
        this("Nobody", "nobody123@gmail.com");
    }

    public Customer(String name, String email) {
        // Constructor chaining
        this(name, 200.00, email);
    }

}


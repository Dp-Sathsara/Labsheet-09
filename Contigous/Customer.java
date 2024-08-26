package Contigous;

public class Customer {
    public String accountNumber;
    public String customerName;
    public String accountType;
    public double accountBalance;

    public Customer(String accountNumber, String customerName, String accountType, double accountBalance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }
    public String toString(){
        return(accountNumber+"\t\t"+customerName+"\t"+accountType+"\t\t"+accountBalance);
    }
}

import java.util.List;

public class Account  {

    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public Account(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Name " + accountHolderName +
                ", Account Number " + accountNumber +
                ", Balance " + balance;
    }

    public double deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount can't be added. Its less than R0");
        }
        return balance += amount;
    }

    public double withdraw(double amount) {
        if (amount <= 0  || amount > balance) {
            throw new IllegalArgumentException("Insufficient funds. Amount exceeds Balance!!");
        }

       return balance -= amount;

    }
}

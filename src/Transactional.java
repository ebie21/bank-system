public interface Transactional {
    double deposit(double amount);
    double withdraw(double amount) throws InsufficientFundsException;
}

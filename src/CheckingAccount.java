public class CheckingAccount extends Account implements Transactional{
    private  double overdraftLimit;

    public CheckingAccount(String accountNumber, String accountHolderName, double balance,double overdraftLimit) {
        super(accountNumber, accountHolderName, balance );
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" + " overdraftLimit ="
                + overdraftLimit + " }" + super.toString();
    }
}

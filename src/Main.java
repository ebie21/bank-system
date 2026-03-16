import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();

        Bank bank = new Bank();
        Account account = new Account("001", "John Doe",5000);
        Account account1 = new Account("002", "Jane Smith",8000);
        Account account2 = new Account("003", "Mike Ross",6000);

        bank.addAccount(account);
        bank.addAccount(account1);
        bank.addAccount(account2);

        for(Account acc : bank.getAllAccounts()) {
            System.out.println(acc);
        }

        Account findAccount = bank.findAccount("001");
        System.out.println("Found: " +findAccount);


    }
}
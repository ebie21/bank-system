import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InsufficientFundsException, IOException {
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


        System.out.println("Account number: " + bank.deleteAccount("002")
                .getAccountNumber()
        +" Has been deleted");

        System.out.println( bank.deposit("001",50000).toString());
        System.out.println(bank.withdraw("001",7000).toString());

        SavingsAccount sa = new SavingsAccount("004","Bob Marley",1000,0.05);
        System.out.println(sa);

        CheckingAccount ca = new CheckingAccount("005","John Doe",5000,0.05);
        System.out.println(ca);

//        System.out.println(bank.withdraw("001", 66500));

        BankStorage bankStorage = new BankStorage();
        bankStorage.saveAccount(bank.getAllAccounts(), "accounts.txt");

        List<String> loaded = bankStorage.loadAccounts("accounts.txt");
        for(String s : loaded) {
            System.out.println(s);
        }
    }
}
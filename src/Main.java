import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InsufficientFundsException, IOException {
        List<Account> accounts = new ArrayList<>();
        Bank bank = new Bank();
        Scanner input = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Welcome to Bank System");
            System.out.println("1. Create Account");
            System.out.println("2. View all Accounts");
            System.out.println("3. Find Account");
            System.out.println("4. Delete Account");
            System.out.println("5. Deposit");
            System.out.println("6. Withdraw");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    String accountNumber = input.nextLine();
                    System.out.println("Enter account name");
                    String accountName = input.nextLine();
                    System.out.println("Enter account balance");
                    double balance = input.nextDouble();
                    Account account = new Account(accountNumber, accountName, balance);
                    bank.addAccount(account);
                    break;
                case 2:
                  for (Account acc : bank.getAllAccounts()) {
                      System.out.println(acc);
                  }
                    break;
              case 3:
                  System.out.print("Enter account number: ");
                  Account found = bank.findAccount(input.nextLine());
                  System.out.println(found);
                  break;
              case 4:
                  System.out.println("Enter account number");
                  Account deleted = bank.deleteAccount(input.nextLine());
                  System.out.println(deleted);
                  break;
              case 5:
                  System.out.println("Enter account number");
                  String accountNumber2 = input.nextLine();
                  System.out.println("Enter amount");
                  double amount2 = input.nextDouble();
                  Account newDepositedAmount = bank.deposit(accountNumber2, amount2);
                  System.out.println(newDepositedAmount);
                  break;
              case 6:
                  System.out.println("Enter account number");
                  String accountNumber3 = input.nextLine();
                  System.out.println("Enter amount");
                  double amount3 = input.nextDouble();
                  Account newAmount = bank.withdraw(accountNumber3, amount3);
                  System.out.println(newAmount);
                  break;
              default:
                  System.out.println("Invalid choice");
                  break;
            }
        }while (choice != 7);

            System.out.println("Goodbye.");


    }
}
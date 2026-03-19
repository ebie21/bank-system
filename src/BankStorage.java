import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class BankStorage {

    public void saveAccount(List<Account> accounts, String fileName) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

        for (Account account : accounts) {
            writer.write(account.toString());
            writer.newLine();
        }

        writer.close();
    }
}

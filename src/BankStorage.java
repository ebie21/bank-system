import java.io.*;
import java.util.ArrayList;
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

    public List<String> loadAccounts(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        List<String> result = new ArrayList<>();
        String line;

        while ((line = reader.readLine()) != null) {
           result.add(line);
        }

        reader.close();
        return result;
    }
}

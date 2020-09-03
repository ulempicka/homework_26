import java.util.List;
import java.util.Scanner;

public class TransactionShowByType {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj typ: wydatek / przychód");
        String type = scanner.nextLine();

        TransactionDao transactionDao = new TransactionDao();
        List<Transaction> transactions = transactionDao.findByType(type);
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
    }
}

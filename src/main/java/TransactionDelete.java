import java.util.Scanner;

public class TransactionDelete {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ID transakcji");
        int id = scanner.nextInt();

        TransactionDao transactionDao = new TransactionDao();
        transactionDao.delete(id);
        System.out.println("Usunięto!");
    }
}

import java.util.Scanner;

public class TransactionAdd {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj typ: wydatek / przychód");
        String type = scanner.nextLine();

        System.out.println("Podaj opis");
        String description = scanner.nextLine();

        System.out.println("Podaj kwotę");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Podaj datę");
        String date = scanner.nextLine();

        Transaction transaction = new Transaction(type, description, amount, date);

        TransactionDao transactionDao = new TransactionDao();
        transactionDao.add(transaction);
        System.out.println("Dodano!");
    }
}

import java.util.Scanner;

public class TransactionEdit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj id transakcji którą chcesz zaktualizować");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Podaj typ: wydatek / przychód");
        String type = scanner.nextLine();

        System.out.println("Podaj opis");
        String description = scanner.nextLine();

        System.out.println("Podaj kwotę");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Podaj datę");
        String date = scanner.nextLine();

        Transaction transaction = new Transaction(id, type, description, amount, date);

        TransactionDao transactionDao = new TransactionDao();
        transactionDao.edit(transaction);
        System.out.println("Edycja zakończona powodzeniem!");
    }
}

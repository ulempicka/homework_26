import java.util.Scanner;

public class TransactionsApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(true) {

            System.out.println("Co chcesz zrobić?");
            System.out.println("1. Dodaj");
            System.out.println("2. Edytuj");
            System.out.println("3. Usuń");
            System.out.println("4. Wyświetl wszystkie wydatki/przychody");
            System.out.println("0. Koniec");

            String userInput = scanner.nextLine();

            switch (userInput) {
                case "1":
                    TransactionAdd.main(new String[0]);
                    break;
                case "2":
                    TransactionEdit.main(new String[0]);
                    break;
                case "3":
                    TransactionDelete.main(new String[0]);
                    break;
                case "4":
                    TransactionShowByType.main(new String[0]);
                    break;
                case "0":
                    return;
                default:
                    System.out.println("Błędny wybór!");
            }
        }
    }
}

import java.util.Scanner;

public class Total {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String drinksChoice = scanner.nextLine();
            drinksChoice.toUpperCase();
            DrinksMachine drinks = DrinksMachine.valueOf(drinksChoice);
        }
    }
}

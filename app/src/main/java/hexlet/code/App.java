package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.Arprogression;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Gcd;
import hexlet.code.games.PrimeN;


public class App {

    private static Scanner scanner = new Scanner(System.in);
    public static Scanner getScanner() {
        return scanner;
    }
    public static void main(String[] args) {

        System.out.print("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Game Even\n"
                + "3 - Game Calc\n"
                + "4 - Game GCD\n"
                + "5 - Arithmetic progression\n"
                + "6 - Prime number\n"
                + "0 - Exit\n"
                + "Your choice: ");

        String number = scanner.nextLine();
        try {
            switch (number) {
                case "0" -> System.out.println("Goodbye!");
                case "1" -> Cli.greeting();
                case "2" -> Even.parityCheck();
                case "3" -> Calc.calculate();
                case "4" -> Gcd.divisor();
                case "5" -> Arprogression.progression();
                case "6" -> PrimeN.primeNumber();
                default -> throw new CustomException("Error: Invalid value "
                        + "entered!\nValue must be between 0 and 6!");
            }
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}

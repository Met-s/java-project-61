package hexlet.code;
import static hexlet.code.MyValues.QUANTITY_GAME;
import java.util.Scanner;
import hexlet.code.games.Arprogression;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Gcd;
import hexlet.code.games.PrimeN;


public class App {
    public static void main(String[] args) {

        String[] options = {"Exit", "Greet", "Even", "Calc", "GCD",
                            "Progression", "PrimeN"};

        System.out.print("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Game Even\n"
                + "3 - Game Calc\n"
                + "4 - Game GCD\n"
                + "5 - Arithmetic progression\n"
                + "6 - Prime number\n"
                + "0 - Exit\n"
                + "Your choice: ");

        Scanner choice = new Scanner(System.in);
        try {
            int number = choice.nextInt();
            if (QUANTITY_GAME < number || number < 0) {
                throw new Exception();
            }
            switch (options[number]) {
                case "Exit" -> System.out.println("Goodbye!");
                case "Greet" -> Cli.greeting();
                case "Even" -> Even.parityCheck();
                case "Calc" -> Calc.calculate();
                case "GCD" -> Gcd.divisor();
                case "Progression" -> Arprogression.progression();
                case "PrimeN" -> PrimeN.primeNumber();
                default -> System.out.println("Invalid number");
            }
        } catch (Exception e) {
            System.out.println(("Incorrect input!"));
        }
    }
}

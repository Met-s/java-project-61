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
            switch (number) {
                case 0:
                    System.out.println("Goodbye!");
                    break;
                case 1:
                    Cli.greeting();
                    break;
                case 2:
                    Even.parityCheck();
                    break;
                case 3:
                    Calc.calculate();
                    break;
                case 4:
                    Gcd.divisor();
                    break;
                case 5:
                    Arprogression.progression();
                    break;
                case 6:
                    PrimeN.primeNumber();
                default:
            }
        } catch (Exception e) {
            System.out.println(("Incorrect input!"));
        }
    }
}

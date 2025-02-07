package hexlet.code;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        System.out.print("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Game Even\n"
                + "3 - Game Calc\n"
                + "0 - Exit\n"
                + "Your choice: ");

        Scanner choice = new Scanner(System.in);
        try {
            int number = choice.nextInt();
            if (3 < number || number < 0) {
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
                default:
            }
        } catch (Exception e) {
            System.out.println(("Incorrect input!"));
        }
    }
}

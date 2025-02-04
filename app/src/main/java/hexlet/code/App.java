package hexlet.code;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        System.out.print("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Game Even\n"
                + "0 - Exit\n"
                + "Your choice: ");

        Scanner choice = new Scanner(System.in);
        try {
            int number = choice.nextInt();
            if (2 < number || number < 0) {
                throw new Exception();
            }
            switch (number) {
                case 0:
                    System.out.println("Goodbye!");
                    break;
                case 1:
                    Cli.scan();
                    break;
                case 2:
                    Even.parityCheck();
                    break;
                default:
            }
        } catch (Exception e) {
            System.out.println(("Incorrect input!"));
        }
    }
}

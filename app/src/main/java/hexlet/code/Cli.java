package hexlet.code;
import java.io.IOException;
import java.util.Scanner;


public class Cli {
    /**
     * Getting to know the user.
     */
    private static String nameUser;
    public static void greeting() {

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scan = new Scanner(System.in);
        nameUser = scan.next();
        System.out.println("Hello, " + nameUser + "!");
    }

    public static String getNameUser() {
        return nameUser;
    }
}

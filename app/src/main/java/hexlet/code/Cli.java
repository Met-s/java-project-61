package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static void scan() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Hello, " + name + "!");
        scan.close();
    }
}

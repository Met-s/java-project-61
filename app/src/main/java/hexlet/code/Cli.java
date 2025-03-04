package hexlet.code;
/**
 * Getting to know the user.
 */
public class Cli {

    private static String nameUser;
    public static void greeting() {

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        nameUser = App.scanner.nextLine();
        System.out.println("Hello, " + nameUser + "!");
    }

    public static String getNameUser() {
        return nameUser;
    }
}

package hexlet.code;

import java.util.Scanner;
//import static hexlet.code.CustomException.validateInput;

/**
 * Getting to know the user.
 */
public class Cli {

    private static String nameUser;
    public static void greeting() {

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scan = new Scanner(System.in);
        nameUser = scan.nextLine();
        System.out.println("Hello, " + nameUser + "!");

//        try {
//            validateInput(nameUser);
//        } catch (CustomException e) {
//            System.out.println(("Error: " + e.getMessage()));
//        }
    }

    public static String getNameUser() {
        return nameUser;
    }
}

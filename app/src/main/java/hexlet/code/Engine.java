package hexlet.code;

import java.util.Random;
import java.util.Scanner;
import static hexlet.code.Cli.nameUser;


public class Engine {
    /**
     * General methods used in the application.
     * User interaction
     * Pseudo random number from 0 to input parameter
     * Displays the final message about successful completion of the game
     */
    public static String answer;

    public static void game(String number) throws Exception {
        /*
        User interaction
         */
        System.out.println("Question: " + number);
        System.out.print("Your answer: ");
        Scanner scan1 = new Scanner(System.in);
        answer = scan1.next();
    }

    public static int random(int maxRandom) {
        /*
        Pseudo random number from 0 to input parameter
         */
        Random random = new Random();
        return random.nextInt(maxRandom);
    }

    public static void finall(int correctAnswers) {
        /*
        Displays the final message about successful completion of the game
         */
        if (correctAnswers == 3) {
            System.out.println("Congratulations, " + nameUser + "!");
        }
    }
}

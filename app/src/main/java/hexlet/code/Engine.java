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

    public static void userInteraction(String number) {
        /*
        User interaction
         */
        System.out.println("Question: " + number);
        System.out.print("Your answer: ");
        Scanner scan1 = new Scanner(System.in);
        answer = scan1.next();
    }

    public static boolean generalLogic(String number, int number1) {

        userInteraction(number);

        int answers = Integer.parseInt(answer);
        String userName = Cli.nameUser;

        if (number1 == answers) {
            System.out.println("Correct!");
            return true;

        } else {
            System.out.printf("'%s' is wrong answer ;). "
                            + "Correct answer was '%d'.\nLet`s try again, %s!",
                    answer, number1, userName);
            return false;

        }
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

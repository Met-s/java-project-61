package hexlet.code;
import static hexlet.code.MyValues.CORRECT_ANSWERS;
import java.util.Random;
import java.util.Scanner;


public class Engine {
    /**
     * General methods used in the application.
     * User interaction
     * Pseudo random number from 0 to input parameter
     * Displays the final message about successful completion of the game
     */
    private static String answer;

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


        String userName = Cli.getNameUser();

        userInteraction(number);

        int answers = Integer.parseInt(answer);

        if (number1 == answers) {
            System.out.println("Correct!");
            return true;

        } else {
            System.out.printf("'%s' is wrong answer ;). "
                            + "Correct answer was '%d'.\nLet's try again, %s!",
                    answer, number1, userName);
            return false;

        }
    }


    public static boolean game(String result) throws Exception {


        String nameUser = Cli.getNameUser();

        if ((!answer.equals("no")) & (!answer.equals("yes"))) {
            throw new Exception();
        }

        if (result.equals("yes")) {
            if (answer.equals("yes")) {
                System.out.println("Correct!");
                return true;

            } else {
                System.out.println("'no' is wrong answer ;(. Correct "
                        + "answer was 'yes'.\nLet's try again, "
                        + nameUser + "!");
                return false;

            }
        }
        if (result.equals("no")) {
            if (answer.equals("no")) {
                System.out.println("Correct!");
                return true;

            } else {
                System.out.println("'yes' is wrong answer ;(. Correct"
                        + " answer was 'no'.\nLet's try again, "
                        + nameUser + "!");
                return false;
            }
        }
        return false;
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

        String nameUser = Cli.getNameUser();

        if (correctAnswers == CORRECT_ANSWERS) {
            System.out.println("Congratulations, " + nameUser + "!");
        }
    }
}

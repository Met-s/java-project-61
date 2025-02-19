package hexlet.code;
import static hexlet.code.MyValues.CORRECT_ANSWERS;
import java.util.Scanner;

/**
 * General methods used in the application.
 * User interaction
 * Pseudo random number from 0 to input parameter
 * Displays the final message about successful completion of the game
 */
public class Engine {

    private static String answer;
    /**
     * User interaction.
     * @param number
     */
    public static void userInteraction(String number) {

        System.out.println("Question: " + number);
        System.out.print("Your answer: ");
        Scanner scan1 = new Scanner(System.in);
        answer = scan1.next();
    }

    /**
     * Logic common to all games.
     * -
     * String[] is accepted as input.
     * Depending on the number of elements in the array, the event handling
     * option is selected.
     * @param number
     * Option with one element: boolean value with options "yes" and "no" .
     * Option with two elements: implies solving some expression.
     *
     * @return Default value
     * @throws Exception Exception: entering an invalid value
     */

    public static boolean generalLogic(String[] number) throws Exception {
        int length = number.length;
        String userName = Cli.getNameUser();

        if (length == 1) {
            if ((!answer.equals("no")) & (!answer.equals("yes"))) {
                throw new Exception();
            }
            if (number[0].equals("yes")) {
                if (answer.equals("yes")) {
                    System.out.println("Correct!");
                    return true;
                } else {
                    System.out.println("'no' is wrong answer ;(. Correct "
                            + "answer was 'yes'.\nLet's try again, "
                            + userName + "!");
                    return false;
                }
            }
            if (number[0].equals("no")) {
                if (answer.equals("no")) {
                    System.out.println("Correct!");
                    return true;
                } else {
                    System.out.println("'yes' is wrong answer ;(. Correct"
                            + " answer was 'no'.\nLet's try again, "
                            + userName + "!");
                    return false;
                }
            }

        }
        if (length == 2) {
            userInteraction(number[0]);

            if (number[1].equals(answer)) {
                System.out.println("Correct!");
                return true;
            } else {
                System.out.printf("'%s' is wrong answer ;). "
                                + "Correct answer was '%s'.\nLet`s try "
                                + "again, %s!",
                        answer, number[1], userName);
                return false;
            }
        }
        return false;
    }


    /**
     * Displays the final message about successful completion of the game.
     * @param correctAnswers
     */

    public static void endConversation(int correctAnswers) {

        String nameUser = Cli.getNameUser();

        if (correctAnswers == CORRECT_ANSWERS) {
            System.out.println("Congratulations, " + nameUser + "!");
        }
    }
}

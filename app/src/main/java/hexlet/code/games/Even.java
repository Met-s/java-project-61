package hexlet.code.games;
import static hexlet.code.MyValues.CORRECT_ANSWERS;
import static hexlet.code.MyValues.MAX_RANDOM_NUMBER;
import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Utils;

/**
 * Game "Check for parity".
 * Game essence:
 * The user is shown a random number,
 * needs to answer "yes" if the number is even,
 * or "no" if it is odd:
 * If the user gives an incorrect answer, the game ends.
 * The user must give the correct answer to three questions in a row.
 * Any incorrect input is considered an error.
 */
public class Even {

    public static void parityCheck() throws Exception {

        int correctAnswers = 0;

        Cli.greeting();

        System.out.println("Answer 'yes' if the number is even, "
                + "otherwise answer 'no'.");

        while (correctAnswers < CORRECT_ANSWERS) {
            int number = Utils.random(MAX_RANDOM_NUMBER);

            Engine.userInteraction(String.valueOf(number));

            String result = (number % 2 == 0) ? "yes" : "no";

            String[] answer = {result};

            if (Engine.generalLogic(answer)) {
                correctAnswers++;
            } else {
                break;
            }
        }
        Engine.endConversation(correctAnswers);
    }
}

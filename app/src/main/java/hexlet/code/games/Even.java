package hexlet.code.games;
import static hexlet.code.MyValues.*;
import hexlet.code.Cli;
import hexlet.code.Engine;


public class Even {
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
    public static void parityCheck() throws Exception {

        int correctAnswers = 0;

        Cli.greeting();

        System.out.println("Answer 'yes' if the number is even, "
                + "otherwise answer 'no'.");

        while (correctAnswers < CORRECT_ANSWERS) {
            int number = Engine.random(MAX_RANDOM_NUMBER);

            Engine.userInteraction(String.valueOf(number));

            String result = (number % 2 == 0) ? "yes" : "no";
            if (Engine.game(result)) {
                correctAnswers++;
            } else {
                break;
            }
        }
        Engine.finall(correctAnswers);
    }
}

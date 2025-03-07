package hexlet.code.games;

import static hexlet.code.Constants.CORRECT_ANSWERS;
import static hexlet.code.Constants.MAX_RANDOM_NUMBER;
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

    public static void parityCheck() {

        int correctAnswers = 0;
        String[][] example = new String[CORRECT_ANSWERS][2];
        String gameCondition = "Answer 'yes' if the number is even, "
                + "otherwise answer 'no'.";

        while (correctAnswers < CORRECT_ANSWERS) {
            int number = Utils.random(MAX_RANDOM_NUMBER);
            String result = (number % 2 == 0) ? "yes" : "no";
            example[correctAnswers] =
                    new String[] {String.valueOf(number), result};
            correctAnswers++;
        }
        Engine.generalLogic(example, gameCondition);
    }
}

package hexlet.code.games;

import static hexlet.code.MyValues.CORRECT_ANSWERS;
import static hexlet.code.MyValues.MAX_RANDOM_NUMBER;
import hexlet.code.Engine;
import hexlet.code.Utils;



public class PrimeN {
    public static void primeNumber() {

        int correctAnswers = 0;
        String[][] example = new String[CORRECT_ANSWERS][2];
        String gameCondition = "Answer 'yes' if given number is prime. "
                                                  + "Otherwise answer 'no'.";

        while (correctAnswers < CORRECT_ANSWERS) {
            int number = Utils.random(MAX_RANDOM_NUMBER);
            String result = "yes";

            if (number < 2) {
                result = "no";
            }
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    result = "no";
                }
            }
            example[correctAnswers] = new String[]{String.valueOf(number),
                                                      result};
            correctAnswers++;
        }
        Engine.generalLogic(example, gameCondition);
    }
}

package hexlet.code.games;

import static hexlet.code.Constants.CORRECT_ANSWERS;
import static hexlet.code.Constants.MAX_RANDOM_NUMBER_GCD;
import hexlet.code.Engine;
import hexlet.code.Utils;


public class Gcd {
    public static void divisor() {

        int correctAnswer = 0;
        String gameCondition = "Find the greatest common divisor of given "
                + "numbers.";
        String[][] example = new String[CORRECT_ANSWERS][2];

        while (correctAnswer < CORRECT_ANSWERS) {
            int number1 = Utils.random(MAX_RANDOM_NUMBER_GCD) + 1;
            int number2 = Utils.random(MAX_RANDOM_NUMBER_GCD) + 1;
            String outputNambers = number1 + " " + number2;

            while (number2 != 0) {
                int temp = number1 % number2;
                number1 = number2;
                number2 = temp;
            }
            example[correctAnswer] = new String[] {outputNambers,
                    String.valueOf(number1)};
            System.out.println(number1);
            correctAnswer++;
        }
        Engine.generalLogic(example, gameCondition);
    }
}

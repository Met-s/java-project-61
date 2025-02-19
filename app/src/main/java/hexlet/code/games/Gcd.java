package hexlet.code.games;
import static hexlet.code.MyValues.CORRECT_ANSWERS;
import static hexlet.code.MyValues.MAX_RANDOM_NUMBER_GCD;
import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Utils;


public class Gcd {
    public static void divisor() throws Exception {

        int correctAnswer = 0;
        Cli.greeting();
        System.out.println("Find the greatest common divisor of given "
                + "numbers.");

        while (correctAnswer < CORRECT_ANSWERS) {
            int number1 = Utils.random(MAX_RANDOM_NUMBER_GCD) + 1;
            int number2 = Utils.random(MAX_RANDOM_NUMBER_GCD) + 1;
            String outputNambers = number1 + " " + number2;

            while (number2 != 0) {
                int temp = number1 % number2;
                number1 = number2;
                number2 = temp;
            }
            String numberString = String.valueOf(number1);
            String[] answers = {outputNambers, numberString};

            if (Engine.generalLogic(answers)) {
                correctAnswer++;

            } else {
                break;
            }
        }
        Engine.endConversation(correctAnswer);
    }
}

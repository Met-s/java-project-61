package hexlet.code.games;
import static hexlet.code.MyValues.CORRECT_ANSWERS;
import static hexlet.code.MyValues.MAX_RANDOM_NUMBER;
import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Utils;


public class PrimeN {
    public static void primeNumber() throws Exception {

        int correctAnswers = 0;

        Cli.greeting();
        System.out.println("Answer 'yes' if given number is prime. Otherwise "
                + "answer 'no'.");

        while (correctAnswers < CORRECT_ANSWERS) {
            int number = Utils.random(MAX_RANDOM_NUMBER);
            String result = "yes";
            Engine.userInteraction(String.valueOf(number));

            if (number < 2) {
                result = "no";
            }

            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    result = "no";
                    break;
                }
            }
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

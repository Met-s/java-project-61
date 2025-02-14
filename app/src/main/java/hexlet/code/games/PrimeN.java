package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import static hexlet.code.Engine.answer;


public class PrimeN {
    public static void primeNumber() throws Exception {

        int correctAnswers = 0;

        Cli.greeting();
        System.out.println("Answer 'yes' if given number is prime. Otherwise "
                + "answer 'no'.");

        while (correctAnswers < 3) {
            int number = Engine.random(100);
            String result = "yes";
            Engine.userInteraction(String.valueOf(number));

            if ((!answer.equals("no")) & (!answer.equals("yes"))) {
                throw new Exception();
            }

            if (number < 2) {
                result = "no";
            }

            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    result = "no";
                    break;
                }
            }

            if (Engine.game(result)) {
                correctAnswers++;
            } else {
                break;
            }
        }
        Engine.finall(correctAnswers);
    }
}

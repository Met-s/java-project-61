package hexlet.code.games;
import static hexlet.code.MyValues.CORRECT_ANSWERS;
import static hexlet.code.MyValues.MAX_RANDOM_NUMBER;
import static hexlet.code.MyValues.MAX_RANDOM_OPERATORS;
import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Utils;

/**
 * The user is asked to solve a mathematical expression.
 * You need to give three correct answers in a row.
 */
public class Calc {

    public static void calculate() throws Exception {

        int result = 0;
        int correctAnswers = 0;
        String[] operators = {"+", "-", "*"};
        Cli.greeting();
        System.out.println("What is the result of the expression?");

        while (correctAnswers < CORRECT_ANSWERS) {
            int number1 = Utils.random(MAX_RANDOM_NUMBER) + 1;
            int number2 = Utils.random(MAX_RANDOM_NUMBER) + 1;
            int i = Utils.random(MAX_RANDOM_OPERATORS);
            String outputResult = number1 + " " + operators[i] + " " + number2;

            switch (i) {
                case 0 :
                    result = (number1 + number2);
                    break;
                case 1 :
                    result = (number1 - number2);
                    break;
                case 2 :
                    result = (number1 * number2);
                    break;
                default :
            }
            String resultString = String.valueOf(result);
            String[] answers = {outputResult, resultString};

            if (Engine.generalLogic(answers)) {
                correctAnswers++;
            } else {
                break;
            }
            Engine.endConversation(correctAnswers);
        }
    }
}

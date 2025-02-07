package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class Calc {
    /**
     * The user is asked to solve a mathematical expression.
     * You need to give three correct answers in a row.
     */
    public static void calculate() throws Exception {

        int result1 = 0;
        int correctAnswers = 0;
        String[] operators = {"+", "-", "*"};

        Cli.greeting();
        String userName = Cli.nameUser;
        System.out.println("What is the result of the expression?");

        while (correctAnswers < 3) {
            int number1 = Engine.random(20) + 1;
            int number2 = Engine.random(20) + 1;
            int i = Engine.random(3);
            String result = number1 + " " + operators[i] + " " + number2;

            switch (i) {
                case 0 :
                    result1 = (number1 + number2);
                    break;

                case 1 :
                    result1 = (number1 - number2);
                    break;
                case 2 :
                    result1 = (number1 * number2);
                    break;
                default :
            }

            Engine.game(result);
            int answer = Integer.parseInt(Engine.answer);

            if (result1 == answer) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("'" + answer + "'" + "is wrong answer"
                        + " ;(. Correct answer was " + "'" + result1 + "'"
                        +  ".\nLet`s try again, " + userName + "!");
                break;
            }
            Engine.finall(correctAnswers);
        }
    }
}

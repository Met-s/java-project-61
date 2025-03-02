package hexlet.code.games;

import static hexlet.code.MyValues.CORRECT_ANSWERS;
import static hexlet.code.MyValues.MAX_RANDOM_NUMBER;

import hexlet.code.Cli;

import hexlet.code.Utils;


import java.util.Scanner;


public class PrimeN {
    public static void primeNumber() {

        int correctAnswers = 0;
        String result = "";
        String gameCondition = "Answer 'yes' if given number is prime. Otherwise "
                + "answer 'no'.";
        Cli.greeting();
        String userName = Cli.getNameUser();
        System.out.println(gameCondition);


        while (correctAnswers < CORRECT_ANSWERS) {
            int number = Utils.random(MAX_RANDOM_NUMBER);
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            Scanner scan1 = new Scanner(System.in);
            String answer = scan1.next();

            if (number < 2) {
                result = "no";
            }
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    result = "no";
                } else {
                    result = "yes";
                }
            }


            if (result.equals("yes")) {
                if (answer.equals("yes")) {
                    System.out.println("Correct!");
                    correctAnswers++;
                } else {
                    System.out.println("'no' is wrong answer ;(. Correct "
                            + "answer was 'yes'.\nLet's try again, "
                            + userName + "!");
                    break;
                }
            }
            if (result.equals("no")) {
                if (answer.equals("no")) {
                    System.out.println("Correct!");
                    correctAnswers++;
                } else {
                    System.out.println("'yes' is wrong answer ;(. Correct"
                            + " answer was 'no'.\nLet's try again, "
                            + userName + "!");
                    break;
                }
            }

            if (correctAnswers == CORRECT_ANSWERS) {
                System.out.println("Congratulations, " + userName + "!");

            }

        }
//        Engine.finall(correctAnswers);





    }
}

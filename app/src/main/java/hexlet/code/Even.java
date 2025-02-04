package hexlet.code;
import java.util.Scanner;


public class Even {
    public static void parityCheck() throws Exception {
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
        int minRandom = 1;
        int maxRandom = 100;
        int correctAnswers = 0;
        Cli.scan();
        String nameUser = Cli.nameUser;

        System.out.println("Answer 'yes' if the number is even, "
                + "otherwise answer 'no'.");

        while (correctAnswers < 3) {
            int number =
                    minRandom + (int) (Math.random() * ((maxRandom - minRandom) + 1));
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            Scanner scan1 = new Scanner(System.in);
            String answer = scan1.next();

            if ((!answer.equals("no")) & (!answer.equals("yes"))) {
                throw new Exception();
            }

            if (number % 2 == 0) {
                if (answer.equals("yes")) {
                    System.out.println("Correct!");
                    correctAnswers++;
                }
                if (answer.equals("no")) {
                    System.out.println("'no' is wrong answer ;(. Correct "
                            + "answer was 'yes'.\nLet's try again, "
                            + nameUser + "!");
                    break;
                }
            } else {
                if (answer.equals("no")) {
                    System.out.println("Correct!");
                    correctAnswers++;
                }
                if (answer.equals("yes")) { // ok
                    System.out.println("'yes' is wrong answer ;(. Correct"
                            + " answer was 'no'.\nLet's try again, "
                            + nameUser + "!");
                    break;
                }
            }
        }
        if (correctAnswers == 3) {
            System.out.println("Congratulations, " + nameUser + "!");
        }
    }
}

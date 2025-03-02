package hexlet.code;

import static hexlet.code.MyValues.CORRECT_ANSWERS;


import java.util.Scanner;

/**
 * General methods used in the application.
 * User interaction
 * Pseudo random number from 0 to input parameter
 * Displays the final message about successful completion of the game
 */
public class Engine {

    /**
     * Logic common to all games.
     * -
     * String[][] is accepted as input.
     * @param number - String[number of questions][question to the user,
     *                correct answer]
     * @param gameCondition - message about the rules of the game.
     */

    public static void generalLogic(String[][] number, String gameCondition) {

        Cli.greeting();
        System.out.println(gameCondition);
        String userName = Cli.getNameUser();
        String answer;
//        System.out.println("S = " + Arrays.deepToString(number));

        int i = 0;
        while (i < CORRECT_ANSWERS) {
            String exemp = number[i][0];
            String num1 = number[i][1];
            System.out.printf("Question: %s\nYour answer: ", exemp);
            Scanner scan = new Scanner(System.in);
            answer = scan.next();

            if (answer.equals(num1)) {
                System.out.println("Correct!");
                i++;
            } else {
                System.out.printf("'%s' is wrong answer ;). "
                        + "Correct answer was '%s'.\nLet's try "
                        + "again, %s!", answer, num1, userName);

                break;
            }
        }
        if (i == CORRECT_ANSWERS) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }

//    public static boolean game(String result) throws Exception {
//
//
//        String nameUser = Cli.getNameUser();
//        if (length == 1) {
//            if ((!answer.equals("no")) & (!answer.equals("yes"))) {
//                throw new Exception();
//            }

//

//            if (length == 2) {
//                userInteraction(number[0]);
//
//                if (result.equals("yes")) {
//                    if (answer.equals("yes")) {
//                        System.out.println("Correct!");
//                        return true;
//
//                    } else {
//                        System.out.println("'no' is wrong answer ;(. Correct "
//                                + "answer was 'yes'.\nLet's try again, "
//                                + nameUser + "!");
//                        return false;
//
//                    }
//                }
//                if (result.equals("no")) {
//                    if (answer.equals("no")) {
//                        if (number[1].equals(answer)) {
//                            System.out.println("Correct!");
//                            return true;
//
//                        } else {
//                            System.out.println("'yes' is wrong answer ;(. Correct"
//                                    + " answer was 'no'.\nLet's try again, "
//                                    + nameUser + "!");
//                            System.out.printf("'%s' is wrong answer ;). "
//                                            + "Correct answer was '%s'.\nLet`s try "
//                                            + "again, %s!",
//                                    answer, number[1], userName);
//                            return false;
//                        }
//                    }
//                    return false;
//                }
//            }

//    public static void finall(int correctAnswers) {
//                    if (correctAnswers == 3) {
//                        System.out.println("Congratulations, " + nameUser + "!");
//                    }
//                }

}

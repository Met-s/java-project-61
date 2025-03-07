package hexlet.code;

import static hexlet.code.Constants.CORRECT_ANSWERS;

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

        int i = 0;
        while (i < CORRECT_ANSWERS) {
            String exemp = number[i][0];
            String num1 = number[i][1];
            System.out.printf("Question: %s\nYour answer: ", exemp);
            answer = App.getScanner().next();

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
}

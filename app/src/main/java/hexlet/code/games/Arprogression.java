package hexlet.code.games;
import static hexlet.code.MyValues.CORRECT_ANSWERS;
import static hexlet.code.MyValues.MAX_RANDOM_NUMBER;
import static hexlet.code.MyValues.MAX_PROGRESSION_VALUE;
import static hexlet.code.MyValues.MIN_PROGRESSION_VALUE;
import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Utils;
import org.apache.commons.lang3.ArrayUtils;


public class Arprogression {
    public static void progression() throws Exception {

        int correctAnswer = 0;

        Cli.greeting();
        System.out.println("What number is missing in the progression?");

        while (correctAnswer < CORRECT_ANSWERS) {
            int number = Utils.random(MAX_RANDOM_NUMBER) + 1;
            int progressionValue = Utils.random(MAX_PROGRESSION_VALUE) + 1;
            String[] numbers = {};

            int i = 0;
            while (i < progressionValue + MIN_PROGRESSION_VALUE) {
                number = number + progressionValue;
                String numberStr = String.valueOf(number);
                numbers = ArrayUtils.add(numbers, numberStr);
                i++;
            }

            int lengthAr = numbers.length - 2;
            int numberIndex = Utils.random(lengthAr) + 2;
            String numberSkipped = numbers[numberIndex];
            numbers[numberIndex] = "..";
            String result = String.join(" ", numbers);

            String[] answers = {result, numberSkipped};

            if (Engine.generalLogic(answers)) {
                correctAnswer++;
            } else {
                break;
            }
        }
        Engine.endConversation(correctAnswer);
    }
}

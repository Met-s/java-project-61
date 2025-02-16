package hexlet.code.games;
import static hexlet.code.MyValues.*;
import hexlet.code.Cli;
import hexlet.code.Engine;
import org.apache.commons.lang3.ArrayUtils;


public class Arprogression {
    public static void progression() {

        int correctAnswer = 0;

        Cli.greeting();
        System.out.println("What number is missing in the progression?");

        while (correctAnswer < CORRECT_ANSWERS) {
            int number = Engine.random(MAX_RANDOM_NUMBER) + 1;
            int progressionValue = Engine.random(MIN_PROGRESSION_VALUE) + 1;
            String[] numbers = {};

            int i = 0;
            while (i < progressionValue + MIN_PROGRESSION_VALUE) {
                number = number + progressionValue;
                String numberStr = String.valueOf(number);
                numbers = ArrayUtils.add(numbers, numberStr);
                i++;
            }

            int lengthAr = numbers.length - 2;
            int numberIndex = Engine.random(lengthAr) + 2;
            int numberSkipped = Integer.parseInt(numbers[numberIndex]);
            numbers[numberIndex] = "..";
            String result = String.join(" ", numbers);

            if (Engine.generalLogic(result, numberSkipped)) {
                correctAnswer++;
            } else {
                break;
            }
        }
        Engine.finall(correctAnswer);
    }
}

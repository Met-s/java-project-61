package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import org.apache.commons.lang3.ArrayUtils;

public class Arprogression {
    public static void progression() {

        int correctAnswer = 0;

        Cli.greeting();
        System.out.println("What number is missing in the progression?");

        while (correctAnswer < 3) {
            int number = Engine.random(50) + 1;
            int progressionValue = Engine.random(8) + 1;
            String[] numbers = {};

            int i = 0;
            while (i < progressionValue + 5) {
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

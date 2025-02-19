package hexlet.code;
import java.util.Random;



public class Utils {
    /**
     * Pseudo random number from 0 to input parameter.
     * @param maxRandom
     * @return random number.
     */
    public static int random(int maxRandom) {

        Random random = new Random();
        return random.nextInt(maxRandom);
    }

}

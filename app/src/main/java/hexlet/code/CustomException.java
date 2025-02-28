package hexlet.code;

import static java.lang.Integer.parseInt;

public class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }

    public static void doSomething(String value) throws CustomException {

        try {
            parseInt(value);
        } catch (NumberFormatException e) {
            throw new CustomException("Invalid value entered!\n"
                    + "Value must be between 0 and 6!");
        }

        int value1 = parseInt(value);

        if (value1 < 0 || value1 > 6) {
            throw new CustomException("Value must be between 0 and 6!");
        }
    }
    public static void validateInput(String value) throws CustomException {
        if (value == null || value.isEmpty()) {
            throw new CustomException("Value must not be empty!");
        }
    }
}

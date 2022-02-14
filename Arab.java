public class Arab {

    public static int ArabicCalc(String arab1, String arab2, char symbol) {
        int firstNumber = Integer.parseInt(String.valueOf(arab1));
        int secondNumber = Integer.parseInt(String.valueOf(arab2));

        if (firstNumber>=0 & firstNumber<=10 & secondNumber>=0 & secondNumber<=10) {
            return switch (symbol) {
                case '+' -> firstNumber + secondNumber;
                case '-' -> firstNumber - secondNumber;
                case '*' -> firstNumber * secondNumber;
                case '/' -> firstNumber / secondNumber;
                default -> UNKNOWN_SYMBOL;
            };
        } else {
            return INCORRECT_NUMBER;
        }
    }

    public static int UNKNOWN_SYMBOL = -4815;
    public static int INCORRECT_NUMBER = -1623;
}


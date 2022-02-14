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
                default -> -1313;
            };
        } else {
            return -1313;
        }
    }
}


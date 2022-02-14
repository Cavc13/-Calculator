import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {

        System.out.println("Введите выражение, где цифры должны быть в пределах от 0 до 10 в формате число знак число");

        Scanner reader = new Scanner(System.in);

        String[] numbers = reader.nextLine().trim().split(" ");

        try {
            char firstNumber = numbers[0].charAt(0);
            char secondNumber = numbers[2].charAt(0);
            char symbol = numbers[1].charAt(0);

            if (Character.isDigit(firstNumber) & Character.isDigit(secondNumber)) {

                int result = Arab.ArabicCalc(numbers[0], numbers[2], symbol);

                if (result == Arab.UNKNOWN_SYMBOL) {
                    System.out.println("Неизвестнный математический символ. Введите один из это списка: + - * / ");
                } else if (result == Arab.INCORRECT_NUMBER) {
                    System.out.println("Некоректные цифры! Прочтите внимательнее условия ввода");
                } else {
                    System.out.println("Результат = " + result);
                }
            } else {
                System.out.println("Результат = " + Rome.RomanCalc(numbers[0], numbers[2], symbol));
            }
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: неверный формат чисел! Прочтите внимательнее условия ввода");
        }
    }
}


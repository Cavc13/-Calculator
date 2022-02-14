import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {

        System.out.println("Введите выражение, где цифры должны быть в пределах от 0 до 10 в формате число знак число");

        Scanner reader = new Scanner(System.in);

        String[] numbers = reader.nextLine().split(" ");

        try {
            char firstNumber = numbers[0].charAt(0);
            char secondNumber = numbers[2].charAt(0);
            char symbol = numbers[1].charAt(0);

            if (Character.isDigit(firstNumber) & Character.isDigit(secondNumber)) {

                int e = Arab.ArabicCalc(numbers[0], numbers[2], symbol);

                if (e != -1313)
                    System.out.println("Результат = " + e);
                else
                    System.out.println("Ошибка! Прочтите внимательнее условия ввода");

            } else {
                System.out.println("Результат = " + Rome.RomanCalc(numbers[0], numbers[2], symbol));
            }
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: неверный формат чисел! Прочтите внимательнее условия ввода");
        }
    }
}


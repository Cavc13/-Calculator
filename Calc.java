import java.util.Scanner;

public class Calc {

    static rome Num1 = new rome();
    static arab Num2 = new arab();

    public static void main(String[] args) {

        {
            System.out.println("Введите выражение, где цифры должны быть в пределах от 0 до 10");

            Scanner reader = new Scanner(System.in);

            String[] vich = reader.nextLine().split(" ");

            try {
                char a = vich[0].charAt(0);
                char b = vich[2].charAt(0);
                char s = vich[1].charAt(0);

                if (Character.isDigit(a) & Character.isDigit(b)) {

                    int e = Num2.ArabicCalc(vich[0], vich[2], s);

                    if (e !=-1313)
                    System.out.println("Результат = " + e);
                    else
                        System.out.println("Ошибка!");

                } else {
                    System.out.println("Результат = " + Num1.RomanCalc(vich[0], vich[2], s));
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: неверный формат чисел!");
            }

        }

    }
}


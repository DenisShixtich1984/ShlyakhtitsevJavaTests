package Tests;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Для полноты алгоритма добавил вывод информации в консоль, если цифра равна или меньше (7)семи,
 * а также обработку исключения при вводе буквенных символов
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цифру :");
        try {
            int i = scanner.nextInt();
            if (i > 7) {
                System.out.println("Привет");
            } else System.out.println("Вы ввели число 7 или число меньше 7");
        } catch (InputMismatchException e) {
            System.out.println("Данные ведены не верно");
        }
    }
}

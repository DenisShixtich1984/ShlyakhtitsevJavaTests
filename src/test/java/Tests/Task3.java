package Tests;

import java.util.Scanner;
/**
 * Для полноты алгоритма добавил вывод колличества цифр кратных 3-м в консоль
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int[] number = new int[10];
        for (int i = 0; i < number.length; i++) {
            System.out.println("Введите цифры для элемента с индексом " + i + " :");
            number[i] = scanner.nextInt();
        }
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 3 == 0) {
                count++;
                System.out.print(number[i] + " ");
            }
        }
        System.out.println("\n");
        System.out.println("Количество введенных цифр кратных 3-м равно: " + count);
    }
}

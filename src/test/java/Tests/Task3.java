package Tests;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int[] number = new int[3];
        for (int i = 0; i < number.length; i++) {
            System.out.println("Введите цифры для элемента с индексом :" + i + " :");
            number[i] = scanner.nextInt();

            if (number[i] % 3 == 0) {
                System.out.println("Число кратное трём : " + number[i]);
                count++;
            }
        }
//        if (number[0] % 3 == 0) {
//            System.out.println(number[0]);
//        }
//        if (number[1] % 3 == 0) {
//            System.out.println(number[1]);
//        }
//        if (number[2] % 3 == 0) {
//            System.out.println(number[2]);
//        }

        System.out.println("Количество введенных цифр кратных 3-м равно: " + count);
    }
}

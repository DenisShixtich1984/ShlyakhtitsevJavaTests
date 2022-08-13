package Tests;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цифру :");
        int i = scanner.nextInt();
        if (i > 7) {
            System.out.println("Привет");
        } else System.out.println("Вы ввели число 7 или число меньше 7");
    }
}

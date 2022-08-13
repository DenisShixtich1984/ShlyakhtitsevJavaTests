package Tests;

import java.util.Objects;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя :");
        String name = scanner.next();
        if (Objects.equals(name, "Вячеслав")) {
            System.out.println("Привет, " + "Вячеслав");
        } else System.out.println("Нет такого имени");
    }
}

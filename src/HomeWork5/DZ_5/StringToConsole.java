package HomeWork5.DZ_5;

import java.util.Scanner;

public class StringToConsole {
    public static void stringToConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк(цифрой): ");
        int num = scanner.nextInt();
        String result = "";
        for (int i = 1; i <= num; i++) {
            System.out.println("Введите строку " + i +" : ");
            String string = scanner.next();
            result += string + " ";
        }
        scanner.close();
        System.out.println(result);
    }

    public static void main(String[] args) {
        stringToConsole();
    }
}

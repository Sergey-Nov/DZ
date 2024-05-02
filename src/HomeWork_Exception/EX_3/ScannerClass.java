package HomeWork_Exception.EX_3;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerClass {
    public static void  scannerMethod() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        int errorCount = 0;
        System.out.println("Введите числа,для завершения введите 'exit'");

        while (true) {
            String inputString = scanner.next();
            if ("exit".equalsIgnoreCase(inputString)) {
                break;
            }
            try {
                numbers.add(Integer.parseInt(inputString));
                errorCount = 0;
            } catch (NumberFormatException ex) {
                errorCount++;
                System.out.println("Ошибка ввода! Введите ЧИСЛО, осталось попыток ввода: " + (3 - errorCount));
                if (errorCount >= 3) {
                    System.out.println("Превышено количество не правильных попыток!Закрытие программы ввода чисел.");
                    List<Integer> sortedNumbers = numbers.stream().sorted().toList();
                    System.out.println(sortedNumbers);
                    return;
                }

            }
        }

        scanner.close();
        List<Integer> sortedNumbers = numbers.stream().sorted().toList();
        System.out.println(sortedNumbers);
    }
}


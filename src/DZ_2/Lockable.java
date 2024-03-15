package DZ_2;

import java.util.Scanner;

public interface Lockable {
    static void print() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите pin для доступа в автомобиль:");
        int pin = scanner.nextInt();
        if(pin == 123){
            System.out.println("Машина открыта");
        }
        else {
            System.out.println("Машина закрыта");
        }

    }
}

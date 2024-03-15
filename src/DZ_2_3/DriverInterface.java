package DZ_2_3;
import java.util.Scanner;

public interface DriverInterface {
    static void lock(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Есть ключ от данного авто?");
        String string = scanner.nextLine();
        String lower = string.toLowerCase();
        if (lower.equals("да") || lower.equals("yes")) {
            System.out.println("Машина открыта ,можно заводить");
        }else {
            System.out.println("Ключ не подходит,машина закрыта");
        }
    }
    static void drive(){
        System.out.println("Водитель едет");
    }

    static void getPassengers(){
        System.out.println("Пассажиры садяться");
    }

    static void getFuel(){
        System.out.println("Водитель заправляет авто");
    }

}

package DZ_1_1_2;

import java.util.Scanner;


public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number: ");
        int num = scanner.nextInt();
        int counter = 1;
            for (int i = 1; i <= num; i++){

                System.out.println(counter*=i);
            }

         }
}

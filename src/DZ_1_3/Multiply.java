package DZ_1_3;

import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number: ");
        int result = 1;
        for (int num = scanner.nextInt();num!=0;num/=10){
            result*=(num%10);
            System.out.println(result);
        }
    }
}

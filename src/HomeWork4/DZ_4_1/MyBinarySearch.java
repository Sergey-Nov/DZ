package HomeWork4.DZ_4_1;

import java.util.Random;

public class MyBinarySearch {
    public static void main(String[] args) {
        Random random = new Random();
        int randomInt = random.nextInt(1000000,2000000);

        int [] numb = new int[1000000];
        for(int i = 0;i<1000000;i++){
            numb[i] = i + 1000000;
        }


        System.out.println(MyBinarySearchMethod.binarySearch(numb,randomInt));
        System.out.println(randomInt);

    }
}

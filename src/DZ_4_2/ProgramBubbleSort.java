package DZ_4_2;

import java.util.Arrays;
import java.util.Scanner;

import static DZ_4_2.BubbleSortToArray.sorted;

public class ProgramBubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstIndex = scanner.nextInt();
        int lastIndex = scanner.nextInt();
        System.out.println(firstIndex + " " + lastIndex);
        int [] sortArr = new int[100000];
        for (int i = 0; i < sortArr.length; i++) {
            sortArr[i] = (int)(Math.random()*100000);
        }
        sorted(sortArr);
        System.out.println(Arrays.toString(Arrays.copyOfRange(sortArr, firstIndex, lastIndex)));
        }
}

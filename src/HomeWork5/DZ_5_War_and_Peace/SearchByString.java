package HomeWork5.DZ_5_War_and_Peace;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SearchByString {
    public static void searchByString() throws FileNotFoundException {
        ArrayList<String> result = new ArrayList<>();
        File file = new File("C:\\Java\\Project\\Program\\src\\DZ_5_War_and_Peace\\Война и мир.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] strings = line.toLowerCase().split(" ");
            result.add(Arrays.toString(strings));
        }
        scanner.close();
        System.out.println(result);
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово для поиска в тексте: ");
        String search = sc.nextLine();
        String tolowersearch = search.toLowerCase();
        int counter = 0;
        for (int i = 0; i < result.size(); i++) {
            if (result.get(i).contains(tolowersearch)) {
                counter++;
            }
        }
        System.out.println("Слово " + search + " встречается " + counter + " раз." );
    }
}

package HomeWork5.DZ_5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void searchPhone(String string){
        final String regex = "(\\d{7})";
        final String string1 = string;

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string1);

        while (matcher.find()) {
            System.out.println("Полное соответствие: " + matcher.group(0));

            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.println("Группа " + i + ": " + matcher.group(i));
            }
        }
    }

    public static void searchTgNickname(String string){
        final String regex = "\\w+[a-zA-Z]";
        final String string2 = string;

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string2);

        while (matcher.find()) {
            System.out.println("Полное соответствие: " + matcher.group(0));

            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.println("Группа " + i + ": " + matcher.group(i));
            }
        }
    }
}

package HomeWork5.DZ_5;

public class CompareStrings {
    public static void compareStrings(String string, String string2){
        if (string == string2){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static void stringToChar(String string){
        char[] charArray = string.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }
    }
    public static void main(String[] args) {
        String str = "Мама мыла раму";
        String str2 = "Мама " + "мыла " + "раму";
        compareStrings(str,str2);
        stringToChar(str);
    }

}

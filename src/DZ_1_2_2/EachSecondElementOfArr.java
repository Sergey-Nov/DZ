package DZ_1_2_2;

public class EachSecondElementOfArr {
    public static void main(String[] args) {
        String[] string = new String[]{"Winter","Spring","Summer","Autumn"};
        for(int i = 0; i<string.length;i++){
            if (i%2!=0) {
                System.out.println(string[i]);
            }
        }
    }
}

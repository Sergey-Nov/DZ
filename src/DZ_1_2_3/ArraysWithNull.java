package DZ_1_2_3;

public class ArraysWithNull {
    public static void main(String[] args) {
        String[] string = new String[]{"Winter","Spring",null,"Summer","Autumn"};
        for(int i = 0; i<string.length;i++){
            if (i%2!=0 & string[i]!=null) {
                System.out.println(string[i]);
            }
            else if(string[i]==null){
                break  ;
            }
        }
    }
}

package HomeWork5.DZ_5;

public class StringToLong {
    public static void main(String[] args) {
        String string = "012312";
        Long l1 = Long.valueOf(string);
        Long l2 = Long.parseLong(string);
        /*Deprecated*/
        Long l3 = new Long("012312");
        System.out.println(l1 +"\n" + l2 +"\n" + l3);
    }
}

package HomeWork4.DZ_4_3;



public class Programm {
    public static void main(String[] args) {
        Integer[] integers = new Integer[]{10,15,51,32,31};
        String[] strings = new String[]{"Март","Апрель","Май","Июнь"};
        MyArrayList ddd = new MyArrayList();
        ddd.addArrElements(strings);
        ddd.addElements(1);
        ddd.addElements(2);
        ddd.addArrElements(strings);
        ddd.addArrElements(strings);
        ddd.addArrElements(strings);
        ddd.addArrElements(strings);
        ddd.addArrElements(strings);
        ddd.addElements(3);
        ddd.addElements(4);
        ddd.addElements(4);
        ddd.addElements(4);
        ddd.addElements(4);
        ddd.addArrElements(integers);
        ddd.addElements(4);
        ddd.addElements(4);
        ddd.addElements(4);
        ddd.addElements(4);
        ddd.addElements(4);
        ddd.addToIndex(178,0);
        ddd.removeToIndex(0);
        ddd.removeAllElements();
        System.out.println(ddd);
    }
}

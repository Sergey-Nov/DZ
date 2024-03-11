package DZ_1_3;



public class Fruit {

        String name;
        int price;
        String sale;



    public Fruit(String name, int price, String sale){
            this.name = name;
            this.price = price;
            this.sale = sale;

        }
    public String toString(){
        return name + ", цена " + price + "руб, " + sale;
    }
    public static void main(String[] args) {
            Fruit apple = new Fruit("Яблоко", 3, "В наличии");
            Fruit orange = new Fruit("Апельсин", 5, "В наличии");
            Fruit banana = new Fruit("Банан", 4, "Нет в наличии");

        Object[] fruit = new Object[]{apple,orange,banana};
        for (Object o : fruit) {
            System.out.println(o.toString());
        }

    }
}

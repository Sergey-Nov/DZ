package DZ_2;

public class YourCar implements Lockable  {
        public static void main(String[] args) {
            Car car = new Car(new Engine(2000,"АИ-95","Бензин"),new Wheels(15,"Summer","cast"),new NumberOfSeats(5),new TypeOfDriverLicense("B"));
            System.out.println(car);
            Lockable.print();
        }

}

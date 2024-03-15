package DZ_2_2;


import DZ_2_3.DriverInterface;

public class EnterYourDriver implements DriverInterface {
    public static void main(String[] args) {
        NewDriver sam = new NewDriver(5,"A,AM,B","1 key for any car");
        System.out.println(sam);
        DriverInterface.lock();
        DriverInterface.drive();
        DriverInterface.getPassengers();
        DriverInterface.getFuel();
    }
}

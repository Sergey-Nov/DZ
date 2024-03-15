package DZ_2;

public class NumberOfSeats {
    private  int numberOfSeats;

    @Override
    public String toString() {
        return "Количество мест:" + numberOfSeats;
    }

    public NumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}

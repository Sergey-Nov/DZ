package DZ_2;


public class Car {
    private Engine engine;
    private Wheels wheels;
    private NumberOfSeats numberOfSeats;
    private TypeOfDriverLicense typeOfDriverLicense;

    public Car(Engine engine, Wheels wheels, NumberOfSeats numberOfSeats, TypeOfDriverLicense typeOfDriverLicense) {
        this.engine = engine;
        this.wheels = wheels;
        this.numberOfSeats = numberOfSeats;
        this.typeOfDriverLicense = typeOfDriverLicense;
    }

    @Override
    public String toString() {
        return
                " " + engine +
                " " + wheels +
                " " + numberOfSeats +
                " " + typeOfDriverLicense;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }

    public NumberOfSeats getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(NumberOfSeats numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public TypeOfDriverLicense getTypeOfDriverLicense() {
        return typeOfDriverLicense;
    }

    public void setTypeOfDriverLicense(TypeOfDriverLicense typeOfDriverLicense) {
        this.typeOfDriverLicense = typeOfDriverLicense;
    }
}



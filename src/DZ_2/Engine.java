package DZ_2;

public class Engine {
    private int volume;
    private String gasoline;
    private String typeOfEngine;

    @Override
    public String toString() {
        return "Двигатель:" +
                "Объём: " + volume +
                ", Вид топлива:" + gasoline +
                ", Тип двигателя:" + typeOfEngine;
    }

    public Engine(int volume, String gasoline, String typeOfEngine) {
        this.volume = volume;
        this.gasoline = gasoline;
        this.typeOfEngine = typeOfEngine;

    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getGasoline() {
        return gasoline;
    }

    public void setGasoline(String gasoline) {
        this.gasoline = gasoline;
    }

    public String getTypeOfEngine() {
        return typeOfEngine;
    }

    public void setTypeOfEngine(String typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }
}

package DZ_2;

public class Wheels {
    private int radius;
    private String season;
    private String name;

    @Override
    public String toString() {
        return "Колеса:" +
                "Радиус: " + radius +
                ", Сезон: " + season + '\'' +
                ", Тип диска: " + name + '\'';
    }

    public Wheels(int radius, String season, String name) {
        this.radius = radius;
        this.season = season;
        this.name = name;

    }
}

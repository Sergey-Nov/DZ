package DZ_2_2;

public abstract class Driver {
    private int experience;
    private String typeOfDriverLicense;
    private String haveAnyKey;
    public Driver(int experience, String typeOfDriverLicense,String haveAnyKey) {
        this.experience = experience;
        this.typeOfDriverLicense = typeOfDriverLicense;
        this.haveAnyKey = haveAnyKey;
    }

    @Override
    public String toString() {
        return "Водитель: " +
                "Стаж вождения: " + experience + '\n' +
                "Категории прав: " + typeOfDriverLicense + '\n' +
                "Ключи от других авто: " + haveAnyKey + '\n' ;
    }

    public int getExperience() {
        return experience;
    }
    public String getTypeOfDriverLicense() {
        return typeOfDriverLicense;
    }

    public String getHaveAnyKey() {
        return haveAnyKey;
    }
}

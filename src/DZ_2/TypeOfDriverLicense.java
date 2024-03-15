package DZ_2;

import java.util.Scanner;

public class TypeOfDriverLicense {
    private String typeOfDriverLicense;

    @Override
    public String toString() {
        return "Категория водительского удостоверения:" + typeOfDriverLicense + '\'';
    }

    public TypeOfDriverLicense(String typeOfDriverLicense) {
        this.typeOfDriverLicense = typeOfDriverLicense;
    }
}

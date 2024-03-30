package HomeWork5.DZ_5;

public class TestRegular {
    public static void main(String[] args) {
        String string = "Мой номер телефона +375-29-1234567. Мой ник в Телеграм @TheGodFather.";
        RegularExpression.searchPhone(string);
        RegularExpression.searchTgNickname(string);
    }
}

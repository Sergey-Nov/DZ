package HomeWork_Exception.EX_2;

public class Main {
    public static void main(String[] args) throws CalculateException, CalculateMoreTwentyException {

        CalculateLessTwenty calculateLessTwenty = new CalculateLessTwenty();
        try{
            calculateLessTwenty.squaring(15);
        }catch (CalculateMoreTwentyException e){
            System.out.println("Ошибка: " + e.getMessage());
        }
        CalculateLessTen calculateLessTen = new CalculateLessTen();
        try {
            calculateLessTen.squaring(10);
        }catch (CalculateException e){
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}

package HomeWork_Exception.EX_2;

public class CalculateLessTen {

    public void squaring(int num) throws CalculateException,CalculateMoreTwentyException {
        if(num>=10){
            throw new CalculateException("Введенное число должно быть меньше 10");
        }
        int result = num * num;
        System.out.println(result);
    }
}

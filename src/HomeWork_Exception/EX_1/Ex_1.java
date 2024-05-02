package HomeWork_Exception.EX_1;


public class Ex_1 {
    private static void tryCatchMethod(int a,int b) {
        int result;
        try {
            result = a / b;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void tryFinallyMethod(int a,int b){
        int result;
        try {
            result = a / b;
        } finally {
            System.out.println("Установите число b не равное нулю");
        }
    }

    private static void tryCatchFinallyMethod(int a,int b){
        int result;
        try {
            result = a/b;
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Установите число b не равное нулю");
            System.out.println("Конец метода tryCatchFinallyMethod0");
        }
    }

    public static void main(String[] args) {
        tryCatchFinallyMethod(1,0);
        tryCatchMethod(1,0);
        tryFinallyMethod(1,0);
    }
}

import java.io.FileNotFoundException;

public class task3v2
 {

    public static void printSum(Integer a, Integer b) { // В данной функции мы не ожидаем исключительных событий, нет необходимости в throws
        System.out.println(a + b);
    }
    public static void main(String[] args) {  // В данной функции обрабатываются все ожидаемые исключения, нет необходимости в throws
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc  = { 1, 2 };
            abc[3] = 9;
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        // Не создаются и не освобождаются объекты, нет необходимости отлова данного исключения
        //} catch (NullPointerException ex) {
        //    System.out.println("Указатель не может указывать на null!");
        } catch (ArithmeticException ex) {
            System.out.println("На ноль делить нельзя");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
     
    }
}

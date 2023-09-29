
public class task3v1 {

    public static void printSum(Integer a, Integer b) {  // В данной функции мы не ожидаем исключительных событий
        System.out.println(a + b);
    }
    public static void main(String[] args) {  // В данной функции мы не ожидаем исключительных событий
        int a = 90;
        int b = 3;
        if (b != 0)
            System.out.println(a / b);
        else
            System.out.println("Что-то пошло не так...");

        printSum(23, 234);

        int[] abc = { 1, 2 };
        int n = 3;
        if (n < abc.length && n > 0)
            abc[3] = 9;
        else
            System.out.println("Массив выходит за пределы своего размера!");
    }
}

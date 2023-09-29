/* Вариант решения 1
Исправить следующий код если это необходимо
    try {
        int d = 0;
        double catchedRes1 = intArray[8] / d;
        System.out.println("catchedRes1 = " + catchedRes1);
    } catch (ArithmeticException e) {
        System.out.println("Catching exception: " + e);
    }

 */
public class task2v1 {
    public static void main(String[] args) { // В таком варианте мы не ожидаем никаких исключительных событий 
        int[] intArray = new int[10];

        int d = 0;
        int n = 8;
        if (d != 0 && n < intArray.length && n > 0) {
            double catchedRes1 = intArray[n] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } else {
            System.out.printf("Something wrong:  n = %d, d = %d", n, d);
        }         
    }
}

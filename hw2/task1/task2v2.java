/* Вариант решения 2
Исправить следующий код если это необходимо
    try {
        int d = 0;
        double catchedRes1 = intArray[8] / d;
        System.out.println("catchedRes1 = " + catchedRes1);
    } catch (ArithmeticException e) {
        System.out.println("Catching exception: " + e);
    }

 */
public class task2v2 {
    public static void main(String[] args) { // В таком варианте мы обрабатываем исключения
        int[] intArray = new int[10];
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
            } catch (ArithmeticException e) {
                System.out.println("Catching exception: " + e);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Catching exception: " + e);
            }
                 
    }
}
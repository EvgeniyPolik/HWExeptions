/*
 Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. 
 Ввод текста вместо числа не должен приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя 
 ввод данных.
 */

import java.util.Scanner;

class task1 {
    static String DOUBLE_TEMPLATE = "^-?\\d+(\\.\\d+)?$";
    static String HELLO_MESSAGE = "Введите число: ";

    static Float getFloat() { // Мы неожидаем здесь исключительных ситуаций
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(HELLO_MESSAGE);
            String answer = scanner.nextLine();
            if (answer.matches(DOUBLE_TEMPLATE))
                return Float.parseFloat(answer);
            System.out.println("Неверный ввод!");
        }
       }

    public static void main(String[] args) {
        Float floatValue = getFloat();
        System.out.printf("Введенное число: %.3f", floatValue);
    }
}
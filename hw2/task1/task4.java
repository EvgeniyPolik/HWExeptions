import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        try {
            String userInput = scanner.nextLine();
            if (userInput.isEmpty())
                throw new RuntimeException("Пустые строки не разрешены!");
            System.out.println(userInput);
        } catch (RuntimeException e) {
            System.out.println(e);
        } finally{
            scanner.close();
        }
    }
}

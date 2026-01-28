package next;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String correctPassword = "55 5";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть пароль: ");
        String userPassword = scanner.nextLine();

        if (userPassword.equals(correctPassword)) {
            System.out.println("Доступ дозволено");
        } else {
            System.out.println("Невірний пароль");
        }

        scanner.close();
    }
}

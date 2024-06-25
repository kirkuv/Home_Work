package Home_Work_1;

import java.util.Objects;
import java.util.Scanner;

public class OperSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        switch (a) {
            case ("Вася"):
                System.out.println("Привет!\nЯ тебя так долго ждал");
                break;
                case ("Анастасия"):
                    System.out.println("Я тебя так долго ждал");
                    break;
            default: System.out.println("Добрый день, а вы кто?");
        }

        scanner.close();
    }
}

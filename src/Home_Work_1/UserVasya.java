package Home_Work_1;

import java.util.Objects;
import java.util.Scanner;

public class UserVasya {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        if (Objects.equals(a, "Вася")) {System.out.println("Привет!\nЯ тебя так долго ждал");}
        else
        {
            if (Objects.equals(a, "Анастасия")) {System.out.println("Я тебя так долго ждал");}
              System.out.println("Добрый день, а вы кто?");
        }

        scanner.close();
    }
}

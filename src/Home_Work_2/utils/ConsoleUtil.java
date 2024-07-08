package Home_Work_2.utils;

import java.util.Scanner;

public class ConsoleUtil {
    // метод проверяет, корректно ли в строку записано число типа int
    public static boolean isDouble(String row) throws NumberFormatException {
        try {
            Double.parseDouble(row);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static boolean isInt(String row) throws NumberFormatException {
        try {
            Integer.parseInt(row);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static String inputFromConsole() {
        Scanner console = new Scanner(System.in);

        return console.nextLine();
    }
}

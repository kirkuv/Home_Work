package Home_Work_2.loops;

import Home_Work_2.utils.ConsoleUtil;

public class MaxDigit {
    public static void main(String[] args) {
        String res;

        System.out.print("Введите число: ");
        String row = ConsoleUtil.inputFromConsole();

        if (ConsoleUtil.isInt(row)) {
            int number = Math.abs(Integer.parseInt(row));
            res = "Наибольшая цифра в числе " + Integer.parseInt(row) + " - " + maxDigit(number);
                    }
        else {
            res = "Вы ввели не целое число!";
        }

        System.out.println(res);
    }

    public static int maxDigit (int number) {
        int max = -1;
        while (number > 0) {
            if (number % 10 > max) {
                max = number % 10;
            }
            number /= 10;
        }
        return max;
    }
}

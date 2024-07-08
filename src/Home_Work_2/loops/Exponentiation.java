package Home_Work_2.loops;

import Home_Work_2.utils.ConsoleUtil;

import java.util.Scanner;

/**
 * Возведение в степень. Через консоль пользователь вводит два числа.
 * Первое число это число которое мы будем возводить,
 * Второе число это степень в которую возводят первое число.
 * Степень - только положительная и целая. Возводимое число - может быть отрицательным и оно будет дробным. Math использовать нельзя.
 * 		1.3.1 Пример: Ввели 18 и 5, должно получиться в консоли: 18.0 ^ 5 = 1 889 568.0
 * 		1.3.2 Пример: Ввели 7.5 и 2, должно получиться в консоли: 7.5 ^ 2 = 56.25
 */
public class Exponentiation {
    public static void main(String[] args) {
        double a = 0.0;
        int b = 0;
        boolean correctInput = true;
        while (correctInput != false ){
            System.out.println("Введите возводимое число (оно может быть отрицательным и дробным):");
            String row = ConsoleUtil.inputFromConsole();
            if(ConsoleUtil.isDouble(row)) {
                a = Double.parseDouble(row);
                correctInput = false;
            } else {
                System.out.println("Вы должны ввести дробное число, повторите ввод!");
            }

        }
        correctInput = true;
        while (correctInput != false){
            System.out.println("Введите степень возведения (оно должно быть только положительное и целое число):");
            String row = ConsoleUtil.inputFromConsole();
            if(ConsoleUtil.isInt(row) && Integer.parseInt(row) >= 0) {
                b = Integer.parseInt(row);
                correctInput = false;
            } else {
                System.out.println("Вы должны ввести целое число, повторите ввод!");
            }
        }
        System.out.println(a + " ^ " + b + " = " + exponent(a,b));
    }
    public static double exponent(double a, int b) {
        double result = 1.0;
        for (int i = 0; i < b; i++) {
            result *= a;
        }

        return result;
    }
}

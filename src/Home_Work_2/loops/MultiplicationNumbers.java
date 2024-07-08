package Home_Work_2.loops;

import Home_Work_2.utils.ConsoleUtil;

import java.util.Scanner;

/**
 * Все цифры из числа введенного через аргумент к исполняемой программе перемножить между собой и вывести ход вычислений в консоль.
 * Пользователь обязан ввести целое число. Если ввели не целое то выдать сообщение о том что пользователь ввёл некорректные данные.
 * 		1.2.1 Пример: Ввели 181232375, должно получиться в консоли: 1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10 080
 * 		1.2.2 Пример: Ввели 99.2, должно получиться в консоли: Введено не целое число
 * 		1.2.3 Пример: Ввели Привет, должно получиться в консоли: Введено не число
 */
public class MultiplicationNumbers {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
               if (ConsoleUtil.isInt(args[0])){
            int number = Integer.parseInt(args[0]);
                   char[] arr = args[0].toCharArray();
                   for (int i = 0; i < arr.length; i++)
                       if (i != arr.length - 1) {
                           builder.append(arr[i]);
                           builder.append(" * ");
                       } else {
                           builder.append(arr[i]);
                           builder.append(" = ");
                       }
            builder.append(multiply(number));

        }else if (ConsoleUtil.isDouble(args[0])){
            builder.append("Введено не целое число");
        }else {
                   builder.append("Введено не число");
        }
        System.out.println(builder.toString());
    }
    public static long multiply (int number){
        int result = 1;
        while (number > 0) {
            result *= (number%10);
            number/=10;
        }
        return result;
    }
}

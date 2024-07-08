package Home_Work_2.loops;

import java.util.Scanner;

/** 1.1. Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе. Есть нюанс
 * с переполнением, можно добавить проверки и сообщения пользователю.
 Пример: Ввели 5, должно получиться в консоли: 1 * 2 * 3 * 4 * 5 = ответ
 1.1.1. Используя только цикл
 1.1.2.* Используя рекурсию
 *
 */

public class MultipliedByNumbers {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        int result = 1;
        int number;
        if (scanner.hasNextInt() ){
                number = scanner.nextInt();
            for (int i = 1; i <= number; i++) {
                builder.append(i);
                if (i!= number){
                    builder.append(" * ");
                }else {
                    builder.append(" = ");
                }
            }
            builder.append(multiply(number));
        } else {
            builder.append("Ошибка ввода");
        }
        System.out.println(builder.toString());

    }
    public static long multiply (int number){
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
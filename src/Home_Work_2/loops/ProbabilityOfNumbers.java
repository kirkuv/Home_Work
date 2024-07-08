package Home_Work_2.loops;

import Home_Work_2.utils.ConsoleUtil;

import java.util.Random;

public class ProbabilityOfNumbers {

    public static void main(String[] args) {
        System.out.print("Введите какоке количество случайных чисел хотите проверить на четность: ");
        String row = ConsoleUtil.inputFromConsole();
        String result;

        if (ConsoleUtil.isInt(row) && Integer.parseInt(row) >= 1000) {
            result =  "Процент четных чисел из " + row + " случайно выбранных составляет " + probabilityСalculat(Integer.parseInt(row)) + " %";
        } else {
            result = "Введите целое число большее или равно 1000";
        }

        System.out.println(result);

    }

    public static double probabilityСalculat(int countNum) {
        Random rnd = new Random();
        double count = 0;

        for (int i = 0; i < countNum; i++) {
            if(rnd.nextInt() % 2 == 0) {
                count++;
            }
        }

        return Math.floor(count / countNum * 100);
    }
}

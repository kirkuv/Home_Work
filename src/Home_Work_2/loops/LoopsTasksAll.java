package Home_Work_2.loops;

import Home_Work_2.utils.ConsoleUtil;

import java.util.Random;

public class LoopsTasksAll {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        System.out.print("Введите число (не менее 1000): ");
        String row = ConsoleUtil.inputFromConsole();

        if (ConsoleUtil.isInt(row)) {
            int number = Math.abs(Integer.parseInt(row));

            builder.append("задание 1.5.1\n");
            String res = "Наибольшая цифра в числе " + Integer.parseInt(row) + " - " + maxDigit(number);
            builder.append(res);
            builder.append("\n---------------------------------------------");

            builder.append("\nзадание 1.5.2\n");
            res =  "Процент четных чисел из " + row + " случайно выбранных составляет " + probabilityСalculat(number) + " %";
            builder.append(res);
            builder.append("\n---------------------------------------------");

            builder.append("\nзадание 1.5.3\n");
            res =  "Число " + Integer.parseInt(row) + " содержит " + oddNumbers(number) + " нечетных и " + evenNumbers(number) + " четных цифр";
            builder.append(res);
            builder.append("\n---------------------------------------------");

            builder.append("\nзадание 1.5.6\n");
            res = "Реверс числа " + number + " (решение с возвратом INT) = " + reverseNumToInt(number);
            res += "\nРеверс числа " + number + " (решение с возвратом STRING) = " + reverseNumToString(number);
            builder.append(res);
            builder.append("\n---------------------------------------------");
        } else {
            builder.append("Неверный формат ввода, пробуй еще разочек");
        }
        System.out.println(builder.toString());

        builder = new StringBuilder();

        System.out.println("\nзадание 1.5.4\n");
        System.out.print("Введите число: ");
        row = ConsoleUtil.inputFromConsole();

        if (ConsoleUtil.isInt(row) && Integer.parseInt(row) >= 0) {
            String str = fibonacciOutput(Integer.parseInt(row));
            builder.append(str);
        } else {
            builder.append("Неверный формат ввода!");
        }
        builder.append("\n---------------------------------------------");

        System.out.println(builder.toString());

        builder = new StringBuilder();

        System.out.println("\nзадание 1.5.5\n");
        int start, end, step;
        try {
            System.out.print("Введите начало диапазона: ");
            row = ConsoleUtil.inputFromConsole();
            start = Integer.parseInt(row);

            System.out.print("Введите конец диапазона: ");
            row = ConsoleUtil.inputFromConsole();
            end = Integer.parseInt(row);

            System.out.print("Введите шаг: ");
            row = ConsoleUtil.inputFromConsole();
            step = Integer.parseInt(row);

            builder.append(outputWithIncrement(start,end,step));
        }
        catch (NumberFormatException e) {
            builder.append("Неверный формат ввода");
        }

        System.out.println(builder.toString());
    }

    // максимальная цифра
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

    // вероятности чис
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

    // нечетные
    public static int oddNumbers(int num){
        int count = 0;

        while (num > 0) {
            if (num % 2 == 0) {
                count++;
            }
            num /= 10;
        }
        return count;
    }
    //четные
    public static int evenNumbers(int num){
        int count = 0;

        while (num > 0) {
            if (num % 2 == 1) {
                count++;
            }
            num /= 10;
        }
        return count;
    }

    // Возвращает ряд Фибоначчи в размере, переданном в метод
    public static String fibonacciOutput(int size) {
        int currentNum = 0;
        int nextNum = 1;
        StringBuilder builder = new StringBuilder();

        for (int i = 1; i <= size; i++) {
            int outputNum = currentNum + nextNum;

            builder.append(outputNum);
            if(i != size) {
                builder.append(", ");
            }

            currentNum = nextNum;
            nextNum = outputNum;

        }

        return builder.toString();
    }

    // Возвращает ряд чисел в диапазоне с шагом
    public static String outputWithIncrement(int start, int end, int increment) {
        StringBuilder builder = new StringBuilder();

        for (int i = start; i <= end ; i += increment) {
            builder.append(i);
            if (i + increment <= end) {
                builder.append(", ");
            }
        }

        return builder.toString();
    }

    // Переворот числа. Если нужно возвращение int, то используется этот метод
    // (оно обрезает 0 на конце, целое число не начинается с 0)
    public static int reverseNumToInt(int number) {
        int reverseNumber = 0;
        for (int i = String.valueOf(number).length(); i > 0 ; i--) {
            reverseNumber += (number % 10) * Math.pow(10,i-1);
            number /= 10;
        }

        return reverseNumber ;
    }

    // Переворот числа. Если нужно перевернуть число, не обрезает 0 спереди перевернутого числа
    public static String reverseNumToString (int number) {
        StringBuilder builder = new StringBuilder();

        while (number > 0) {
            builder.append(number % 10);
            number/= 10;
        }

        return builder.toString();
    }
}


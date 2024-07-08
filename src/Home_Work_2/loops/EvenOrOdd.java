package Home_Work_2.loops;

import Home_Work_2.utils.ConsoleUtil;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        String row = ConsoleUtil.inputFromConsole();
        String result;
        if (ConsoleUtil.isInt(row)) {
            int number = Math.abs(Integer.parseInt(row));
            result = "Число " + Integer.parseInt(row) + " содержит " + oddNumbers(number) + " нечетных и " + evenNumbers(number) + " четных цифр";
        } else {
            result = "Вы ввели не целое число!";
        }

        System.out.println(result);
    }
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

}

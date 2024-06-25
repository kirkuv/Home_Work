package Home_Work_1;

import java.util.Scanner;

public class NoddNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int num1 = scanner.nextInt();
        if ((num % 2) == 0) {} else { System.out.println("Число num " + num + " нечетное");}
            if ((num1 % 2) == 0) {} else {System.out.println("Число num1 " + num1 + " нечетное");}
            if (((num % 2) == 0) && ((num1 % 2) == 0)) {System.out.println("нечетных чисел нет");}
                scanner.close();
            }
        }

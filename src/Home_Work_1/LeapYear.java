package Home_Work_1;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a % 4 == 0) {
            if (a % 100 == 0 && a % 400 != 0) {
                System.out.println("НЕ високосный год");
            } else {
                System.out.println("Високосный год");
            }
        }
        else{
            System.out.println("НЕ високосный год");
        }
        scanner.close();
    }
}
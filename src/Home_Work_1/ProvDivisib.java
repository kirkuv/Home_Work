package Home_Work_1;

import java.util.Scanner;

public class ProvDivisib {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int res = a/b;
            if (a%b==0) {
                System.out.println("Числа " + a + " и "+ b + " делятся и их деление равняется " + res);
            }
              else        { System.out.println("Числа " + a + " и "+ b + " не делятся");
        }
        scanner.close();
    }
}

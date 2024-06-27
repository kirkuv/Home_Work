package Home_Work_1;

import java.util.Scanner;

public class LetterOrSymb {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a>=89 && a<= 114) {                                         //если в диапазоне то буква
            System.out.println("Это код латинской буквы");
        }   else { System.out.println("Это код другого символа");}

        scanner.close();
    }
}

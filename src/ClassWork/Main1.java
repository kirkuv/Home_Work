package ClassWork;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner consol = new Scanner(System.in);
        System.out.println("Введите число");
        int input = consol.nextInt();
        while (input > 13){
            System.out.println("НЕ правильно");
            input = consol.nextInt();
            if (input< 13){

            }System.out.println("Молодец");
        }return;

    }
}

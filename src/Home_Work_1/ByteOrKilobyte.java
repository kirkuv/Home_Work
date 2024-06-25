package Home_Work_1;

import java.util.Scanner;

public class ByteOrKilobyte {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Если Вы хотите перевести из киллобайт в байты нажмите 1 если наоборот нажмите 2");
        int a = scanner.nextInt();

        if (a==1) {
            System.out.println("Введите количество киллобайт ");
            int b = scanner.nextInt();
            System.out.println( b*1024 + " Byte");
        }
        else if (a==2) {
            System.out.println("Введите количество байт ");
            int b = scanner.nextInt();
            System.out.println( b/1024.0 + " Byte");
        }   else {
            System.out.println("Не правильно вы ввели данные ");
        }
    }
}

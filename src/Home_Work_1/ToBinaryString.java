package Home_Work_1;

import java.util.Arrays;
import java.util.Scanner;

public class ToBinaryString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число");
        byte number = scanner.nextByte();
        System.out.println(toBinaryString(number));

    }

    public static String toBinaryString(byte number) {
        String num = "";
        int temp = Math.abs(number);
        for (int i = 0; i < 8; i++) {                 // прямой перевод в двоичный
            num = temp % 2 + num;
            temp /= 2;
        }

        if (number < 0) {                           // если число отрицательное
            char[] d = num.toCharArray();
            char[] r = new char[8];

            for (int i = 0; i < d.length; i++) {

                if (d[i] == '1') {
                    r[i] = '0';

                } else {
                    r[i] = '1';
                }
            }

            char[] a = Arrays.copyOf(r, r.length);

            for (int i = 7; i >= 0; i--) {

                if (r[i] == '1') {
                    a[i] = '0';

                } else {
                    a[i] = '1';

                    break;
                }
                num = new String(a);
            }

        }return num;
    }
}
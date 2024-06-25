package Home_Work_1;

import java.util.Scanner;
import java.util.stream.IntStream;

public class AverageValue {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if ((a>=b && a<=c) || (a<=b && a>=c)) {System.out.println(a + " среднее число");}
            else if ((b>=a && b<=c) || (b<=a && b>=c)) {System.out.println(b + " среднее число");}
            else  {System.out.println(c + " среднее число");}
        //System.out.println(IntStream.of(a, b, c).sorted().toArray()[1]);
        scanner.close();
    }

}

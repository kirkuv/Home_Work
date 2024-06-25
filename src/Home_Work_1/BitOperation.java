package Home_Work_1;

import java.util.Scanner;

public class BitOperation
{
public static void main(String [] args){
    Scanner scanner = new Scanner(System.in);
    int firstNumber = scanner.nextInt();
    int secondNumber = scanner.nextInt();
    int result = firstNumber&secondNumber;             // с первым числом и вторым производим оператор И
    int result2 = firstNumber|secondNumber;           // с первым числом и вторым производим оператор ИЛИ
    System.out.println("x & y =" + result);           /*  0000_0101
                                                         &0000_0100
                                                         ----------
                                                         0000_0100 */

    System.out.println("x | y =" + result2);          /*  0000_0101
                                                         |0000_0100
                                                         ----------
                                                         0000_0101 */
    scanner.close();
    }
}

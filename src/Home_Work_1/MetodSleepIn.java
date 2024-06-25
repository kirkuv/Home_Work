package Home_Work_1;

import java.util.Scanner;

public class MetodSleepIn {
    public static void main(String[] args) {
        boolean weekday = false, vacation = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:\nЕсли ввести 1 - значит рабочий день\nЕсли ввести 2 - значит выходной или отпуск");
        int a = scanner.nextInt();
       if (a==1) {
           weekday = true;
       }
       else {
           vacation = true;
       }
        if (!sleepIn(weekday,vacation))
        {
            System.out.println("Вставай");
        }
        else {
            System.out.println("Еще спи");
        }
        scanner.close();


    }
    public static boolean sleepIn(boolean weekday, boolean vacation) {

    if (weekday) {
        if (vacation) {return true;}
        else { return false; }
    }
    else {return true;}
    }
}

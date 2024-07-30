package ClassWork;

import java.util.Random;
import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
       Scanner consol = new Scanner(System.in);
        int size = consol.nextInt();

    }
    public int [] triangl (int [] tr){
        int [] arr = new int[3];
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++)
        {arr[i] = rnd.nextInt(10);}
        return triangl(tr);
    }
}

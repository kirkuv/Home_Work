package ClassWork;



import java.util.Random;

public class TrianglMain7 {
    public static int[] main(String[] args) {
        int [] arr = new int[3];
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++)
        {arr[i] = rnd.nextInt(10);}
    return arr;
    }

}
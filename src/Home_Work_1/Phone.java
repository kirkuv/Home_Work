package Home_Work_1;

public class Phone {
    public static void main(String[] args) {
        int [] ph = {1,2,3,4,5,6,7,8,9,0};
        printph(ph);
        Integer[] ar = new Integer[ph.length];
        for (int i = 0; i < ph.length; i++){
            ar[i] = Integer.valueOf(ph[i]);
            System.out.println(ph);
        }
    }
    public static void printph (int[] ph)
    {
    //System.out.println(ph);
    }
}

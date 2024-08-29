package Control_Work_1.Task_1;

public class Main {
    public static int sumOrRetB (int A, int B, int C){
        if (A>B && A>C){
            return A+C;
        }else {return B;}
    }
    public static double average (int A, int B, int C) {
        return (A+B+C)/3.0;
    }

    public static void main(String[] args) {
        int A = 40;
        int B = 20;
        int C = 34;
        int res = sumOrRetB(A,B,C);
        System.out.println("Результат первого метода: "+ res);
        double res2 = average (A,B,C);
        System.out.println("Результат второго метода: "+res2);
    }
}

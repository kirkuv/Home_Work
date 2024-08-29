package ClassWork;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Main11 {
    boolean[] b = new boolean[3];
    int c= 0;
    public static void main(String[] args) {
    Main11 ba = new Main11();
    ba.s(ba.b,0);
        ba.s(ba.b,2);
        ba.test();
    }
    void s(boolean[] x, int i){
        x[i]=true;
        ++c;
    }
    void test (){
        if (b[0] && b[1] | b[2])
            c++;
        if (b[1] && b[(++c-2)])
            c+=7;
        System.out.println("c " + c);
    }
}
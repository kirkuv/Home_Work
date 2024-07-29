package Home_Work_3.calcs.simple;

public class CalculatorWithOperator {
    public double sum (double a, double b){ return a+b;} // считает сумму
    public double sub (double a, double b){ return a-b;}  // считает разницу
    public double mul (double a, double b){ return a*b;}    // умножение
    public double div (double a, double b) {if (b!=0) return a/b;   //деление с проверкой деления на 0
        System.out.println("На нуль делить нельзя");return 0;}
    public double exponentInt (double a, int deg){                  // возведение в степень
        double res = 1;
        for (int i = 0; i < deg; i++) {
            res *=a;
        }
        return res;
    }
    public double abs(double a) {
        return (a < 0) ? -a : a;
    }  // модуль числа
    public double sqrt (double a) {double l = 0;            //корень числа
        double r = 1e100; //большое число
        double m;
        while (r - l > 1e-8){ //точность
            m = l + (r - l)/2;
            if (m*m > a) l = m;
            else r = m;
        }
        return a;
    }
}

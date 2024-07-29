package Home_Work_3.calcs.simple;

public class CalculatorWithMathCopy {
    public double sum (double a, double b){ return a+b;} // считает сумму
    public double sub (double a, double b){ return a-b;}  // считает разницу
    public double mul (double a, double b){ return a*b;}    // умножение
    public double div (double a, double b) {if (b!=0) return a/b;   //деление с проверкой деления на 0
        System.out.println("На нуль делить нельзя");return 0;}
    public double exponentInt(double a, int deg){
        return Math.pow(a, deg);
    } //возведение в степень

    public double abs(double a){
        return Math.abs(a);
    }   // модуль числа

    public double sqrt(double a){
        return Math.sqrt(a);
    }   //корень числа
}

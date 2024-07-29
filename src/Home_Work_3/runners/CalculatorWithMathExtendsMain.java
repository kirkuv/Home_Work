package Home_Work_3.runners;

import Home_Work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        var calc = new CalculatorWithMathExtends();
        double res;
        res = calc.sum((calc.sum(4.1, calc.mul(15,7))), calc.exponentInt(calc.div(28,5),2));
        System.out.println(res);
    }
}

package Home_Work_3.runners;
import Home_Work_3.calcs.simple.CalculatorWithOperator;

/*
4.1 + 15 * 7 + (28 / 5) ^ 2
 */
public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        var calc = new CalculatorWithOperator();
        double res = 0;
        res = calc.sum((calc.sum(4.1, calc.mul(15,7))), calc.exponentInt(calc.div(28,5),2));

        System.out.println(res);
   }
}

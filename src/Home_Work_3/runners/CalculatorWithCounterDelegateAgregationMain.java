package Home_Work_3.runners;

import Home_Work_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import Home_Work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterDelegateAgregationMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoAgregation calc = new CalculatorWithCounterAutoAgregation(new CalculatorWithMathCopy());
        double result = calc.sum(calc.sum(4.1,calc.mul(15,7)), calc.exponentInt(calc.div(28,5), 2));
        System.out.println(result);
        System.out.println(calc.getCountOperation());
    }
}

package Home_Work_3.runners;

import Home_Work_3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import Home_Work_3.calcs.api.ICalculator;
import Home_Work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {
        ICalculator calculator = new CalculatorWithOperator();
        CalculatorWithCounterAutoAgregationInterface calc = new CalculatorWithCounterAutoAgregationInterface(calculator);
        double res = calc.sum(calc.sum(4.1,calc.mul(15,7)), calc.exponentInt(calc.div(28,5), 2));

        System.out.println(res);
        System.out.println(calc.getCountOperation());
    }
}

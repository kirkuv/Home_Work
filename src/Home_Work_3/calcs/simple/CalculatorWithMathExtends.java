package Home_Work_3.calcs.simple;

import Home_Work_3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {
    @Override
    public double abs(double a) {
        return Math.abs(a);
    }
    @Override
    public double exponentInt(double a, int deg) {
        return Math.pow(a, deg);
    }
    @Override
    public double sqrt(double a) {
        return Math.sqrt(a);
    }
}
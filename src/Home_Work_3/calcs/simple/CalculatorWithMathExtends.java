package Home_Work_3.calcs.simple;

public class CalculatorWithMathExtends extends CalculatorWithOperator{
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
package Home_Work_3.calcs.additional;


import Home_Work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoAgregation {
   private CalculatorWithMathCopy calc;
    private  long countOperation = 0;
    public CalculatorWithCounterAutoAgregation(CalculatorWithMathCopy calc) {
        this.calc = calc;}
    public long getCountOperation() {
        return countOperation;
    }
    public double div(double a, double b) {
        countOperation++;
        return calc.div(a,b);
    }
    public double sum (double a, double b){
        countOperation++;
        return calc.sum(a,b);
    }
    public double mul (double a, double b){
        countOperation++;
        return calc.mul(a,b);
    }
    public double sub (double a, double b){
        countOperation++;
        return calc.sub(a,b);
    }
    public double exponentInt (double a, int b){
        countOperation++;
        return calc.exponentInt(a,b);
    }
    public double abs (double a){
        countOperation++;
        return calc.abs(a);
    }
    public double sqrt (double a){
        countOperation++;
        return calc.sqrt(a);
    }
}
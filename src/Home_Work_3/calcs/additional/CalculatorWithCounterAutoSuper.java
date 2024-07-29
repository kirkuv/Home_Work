package Home_Work_3.calcs.additional;

import Home_Work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    private long count_operation;
    public long getCountOperation(){return count_operation;}
    public double sum (double a, double b){count_operation++; return super.sum(a,b);}
    public double mul (double a, double b){count_operation++; return super.mul(a,b);}
    public double div (double a, double b){count_operation++; return super.div(a,b);}
    public double exponentInt (double a, int deg){count_operation++; return super.exponentInt(a,deg);}
}

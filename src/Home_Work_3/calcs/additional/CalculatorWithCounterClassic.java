package Home_Work_3.calcs.additional;

import Home_Work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
    private long count_operation;
    public void incrementCountOperation(){
        count_operation++;
    }
    public long getCountOperation(){return count_operation;}
}

package Home_Work_3.calcs.additional;

import Home_Work_3.calcs.simple.CalculatorWithMathCopy;
import Home_Work_3.calcs.simple.CalculatorWithMathExtends;
import Home_Work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAgregation {
    private CalculatorWithOperator calcWithOperator;
    private CalculatorWithMathCopy calcWithMathCopy;
    private CalculatorWithMathExtends calcWithMathExtends;
    private long countOperation = 0;

    public CalculatorWithCounterAutoChoiceAgregation (CalculatorWithOperator calc){
        calcWithOperator = calc;
    }
    public CalculatorWithCounterAutoChoiceAgregation (CalculatorWithMathCopy calc){
        calcWithMathCopy = calc;
    }
    public CalculatorWithCounterAutoChoiceAgregation (CalculatorWithMathExtends calc){
        calcWithMathExtends = calc;
    }
    public long getCountOperation(){
        return countOperation;
    }
    public double div (double a, double b){
        countOperation++;
        if (calcWithOperator != null){
            return calcWithOperator.div(a,b);
        } else if (calcWithMathExtends != null) {
            return calcWithMathExtends.div(a,b);
        } else  {
            return calcWithMathCopy.div(a,b);
        }
    }
    public double mul (double a, double b){
        countOperation++;
        if (calcWithOperator != null){
            return calcWithOperator.mul(a,b);
        } else if (calcWithMathExtends != null) {
            return calcWithMathExtends.mul(a,b);
        } else  {
            return calcWithMathCopy.mul(a,b);
        }
    }
    public double sum (double a, double b){
        countOperation++;
        if (calcWithOperator != null){
            return calcWithOperator.sum(a,b);
        } else if (calcWithMathExtends != null) {
            return calcWithMathExtends.sum(a,b);
        } else  {
            return calcWithMathCopy.sum(a,b);
        }
    }
    public double sub (double a, double b){
        countOperation++;
        if (calcWithOperator != null){
            return calcWithOperator.sub(a,b);
        } else if (calcWithMathExtends != null) {
            return calcWithMathExtends.sub(a,b);
        } else  {
            return calcWithMathCopy.sub(a,b);
        }
    }
    public double pow (double a, int deg){
        countOperation++;
        if (calcWithOperator != null){
            return calcWithOperator.exponentInt(a,deg);
        } else if (calcWithMathExtends != null) {
            return calcWithMathExtends.exponentInt(a,deg);
        } else  {
            return calcWithMathCopy.exponentInt(a,deg);
        }
    }
    public double abs (double a){
        countOperation++;
        if (calcWithOperator != null){
            return calcWithOperator.abs(a);
        } else if (calcWithMathExtends != null) {
            return calcWithMathExtends.abs(a);
        } else  {
            return calcWithMathCopy.abs(a);
        }
    }
    public double sqrt (double a){
        countOperation++;
        if (calcWithOperator != null){
            return calcWithOperator.sqrt(a);
        } else if (calcWithMathExtends != null) {
            return calcWithMathExtends.sqrt(a);
        } else  {
            return calcWithMathCopy.sqrt(a);
        }
    }
}

package Home_Work_3.calcs.additional;

import Home_Work_3.calcs.api.ICalculator;
import Home_Work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMemoryDecorator {
    private ICalculator calc;
    ICalculator getCalculator(){
        return calc;
    }

    public CalculatorWithMemoryDecorator(CalculatorWithMathExtends calc) {
        this.calc = calc;
    }
}

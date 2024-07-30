package Home_Work_3.calcs.additional;

import Home_Work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoDecorator {
    private ICalculator calc;
    ICalculator getCalculator(){
        return calc;
    }
    public CalculatorWithCounterAutoDecorator(CalculatorWithMemoryDecorator calc){
        this.calc = calc.getCalculator();
    }
}

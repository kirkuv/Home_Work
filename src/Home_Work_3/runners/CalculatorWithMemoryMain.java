package Home_Work_3.runners;

import Home_Work_3.calcs.additional.CalculatorWithMemory;
import Home_Work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {
        CalculatorWithOperator calcOperator = new CalculatorWithOperator();
        CalculatorWithMemory calcMemory = new CalculatorWithMemory(calcOperator);
        calcMemory.div(28, 5);
        calcMemory.save();
        calcMemory.exponentInt(calcMemory.load(), 2);
        calcMemory.save();
        calcMemory.sum(4.1, calcMemory.load());
        calcMemory.save();
        calcMemory.sum(calcMemory.load(), calcMemory.mul(15, 7));
        calcMemory.save();
        System.out.printf("%.2f%n", calcMemory.load()); // 140.46
    }
}

package test.Home_Work_3;

import Home_Work_3.calcs.simple.CalculatorWithOperator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorWithOperatorTest {
    private CalculatorWithOperator calculator = new CalculatorWithOperator();
    @Test
    public void test1(){
        Assertions.assertEquals(2,calculator.sum(1,1));
    }
    @Test
    public void test2(){
        Assertions.assertEquals(0, calculator.sub(1,1));
    }

}

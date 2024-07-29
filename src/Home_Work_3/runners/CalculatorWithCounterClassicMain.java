package Home_Work_3.runners;
/*
4.1 + 15 * 7 + (28 / 5) ^ 2
 */
import Home_Work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        var calc = new CalculatorWithCounterClassic();
        double res = calc.mul(15, 7);
        calc.incrementCountOperation();
        res = calc.sum(4.1, res);
        calc.incrementCountOperation();
        double temp = calc.div(28,5);
        calc.incrementCountOperation();
        temp = calc.exponentInt(temp, 2);
        calc.incrementCountOperation();
        res = calc.sum(res, temp);
        calc.incrementCountOperation();
        System.out.println(res);
        System.out.println("Всего было сделано " + calc.getCountOperation() +" операций");
    }
}

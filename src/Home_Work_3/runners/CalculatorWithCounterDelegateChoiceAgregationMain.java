package Home_Work_3.runners;

import Home_Work_3.calcs.additional.CalculatorWithCounterAutoChoiceAgregation;
import Home_Work_3.calcs.simple.CalculatorWithMathCopy;
import Home_Work_3.calcs.simple.CalculatorWithMathExtends;
import Home_Work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateChoiceAgregationMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoChoiceAgregation calc = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());
        // Рассчет выражения с помощью экземпляра класса CalculatorWithOperator, переданного в конструктор
        double res = calc.sum(calc.sum(4.1,calc.mul(15,7)), calc.pow(calc.div(28,5), 2));
        System.out.println(res + " класс CalculatorWithOperator");
        System.out.println(calc.getCountOperation());
        // Рассчет выражения с помощью экземпляра класса CalculatorWithMathCopy, переданного в конструктор
        calc = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
        res = calc.sum(calc.sum(4.1,calc.mul(15,7)), calc.pow(calc.div(28,5), 2));
        System.out.println(res + " класс CalculatorWithMathCopy");
        System.out.println(calc.getCountOperation());
        // Рассчет выражения с помощью экземпляра класса CalculatorWithMathExtends, переданного в конструктор
        calc = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());
        res = calc.sum(calc.sum(4.1,calc.mul(15,7)), calc.pow(calc.div(28,5), 2));
        System.out.println(res + " класс CalculatorWithMathExtends");
        System.out.println(calc.getCountOperation());
    }

}

package Home_Work_3.calcs.additional;

import Home_Work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoComposite {

    CalculatorWithMathCopy calc = new CalculatorWithMathCopy();


    // Количество операций

    private long countOperation = 0;

    public long getCountOperation() {
        return countOperation;
    }


     //Деление

    public double div(double x, double y) {
        countOperation++;
        return calc.div(x,y);
    }


     //Умножение

    public double mul(double x, double y) {
        countOperation++;
        return calc.mul(x,y);
    }


    // сложение

    public double sum(double x, double y) {
        countOperation++;
        return calc.sum(x,y);
    }


    //вычитание

    public double sub(double x, double y) {
        countOperation++;
        return calc.sub(x,y);
    }

    /**
    *возведение в степень
     */
    public double exponentInt(double x, int y) {
        countOperation++;
        return calc.exponentInt(x,y);
    }

    /**
     *модуль числа
     */
    public double abs(double x) {
        countOperation++;
        return calc.abs(x);
    }

    /**
    *извлечения корня
     */
    public double sqrt(double x) {
        countOperation++;
        return calc.sqrt(x);
    }
}

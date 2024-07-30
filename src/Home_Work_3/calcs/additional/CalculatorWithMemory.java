package Home_Work_3.calcs.additional;

import Home_Work_3.calcs.api.ICalculator;

public class CalculatorWithMemory {

    ICalculator calc;

    private double last_result;
    private double memory;

    public CalculatorWithMemory(ICalculator calc) {
        this.calc = calc;
        this.last_result = 0;
        this.memory = 0;
    }
    public double load() {     // количество операций
        double temp = memory;
        memory = 0;
        return temp;
    }

    public void save(){
        this.memory = last_result;
    }

    public double div(double x, double y) {    //метод деления числа
        last_result = calc.div(x,y);
        return last_result;
    }

    public double sum(double x, double y) {  // метод суммы
        last_result = calc.sum(x,y);
        return last_result;
    }
    public double mul(double x, double y) {  //метод умножения
        last_result = calc.mul(x,y);
        return last_result;
    }

    public double sub(double x, double y) {    // метод вычитания
        last_result = calc.sub(x,y);
        return last_result;
    }

    public double exponentInt(double x, int y) {   // метод степени
        last_result = calc.exponentInt(x,y);
        return last_result;
    }

    public double abs(double x) {
        last_result = calc.abs(x);
        return last_result;
    }

    public double sqrt(double x) {
        last_result = calc.sqrt(x);
        return last_result;
    }
}

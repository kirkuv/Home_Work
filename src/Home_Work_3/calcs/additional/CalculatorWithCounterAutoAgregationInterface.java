package Home_Work_3.calcs.additional;
/*
Создать класс CalculatorWithCounterAutoAgregationInterface.
	11.1 Внутри класса нельзя создавать объекты (использовать new),
	можно пользоваться только тем что передал вам пользователь вашего класса.
	11.2 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
	11.3 В данном классе должен быть только конструктор принимающий объект типа ICalculator
	11.4 Данный класс напрямую не умеет считать математику, он умеет делегировать
	расчёт математики калькулятору который передали в конструктор
	11.5 В классе должны присутствовать все методы объявленные в интерфейсе.
	11.6 В классе должен быть метод long getCountOperation() который должен
	возвращать количество использований данного калькулятора.
	При вызове данного метода счётчик учёта не увеличивается.
	11.7 Создать класс CalculatorWithCounterAutoCompositeInterfaceMain в котором будет точка входа (main метод).
	В main методе требуется создать экземпляр калькулятора и используя методы из данного экземпляра
	посчитать выражения из задания 1. Вывести в консоль результаты посчитанных выражений
	и результат метода getCountOperation().
 */

import Home_Work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoAgregationInterface {

        ICalculator calc;

        private long countOperation = 0;

    public CalculatorWithCounterAutoAgregationInterface(ICalculator calc) {
            this.calc = calc;
        }
        public long getCountOperation() {     // количество операций
            return countOperation;
        }

        public double div(double x, double y) {    //метод деления числа
            countOperation++;
            return calc.div(x,y);
        }

    public double sum(double x, double y) {  // метод суммы
        countOperation++;
        return calc.sum(x,y);
    }
        public double mul(double x, double y) {  //метод умножения
            countOperation++;
            return calc.mul(x,y);
        }

        public double sub(double x, double y) {    // метод вычитания
            countOperation++;
            return calc.sub(x,y);
        }

        public double exponentInt(double x, int y) {   // метод степени
            countOperation++;
            return calc.exponentInt(x,y);
        }

        public double abs(double x) {
            countOperation++;
            return calc.abs(x);
        }

        public double sqrt(double x) {
            countOperation++;
            return calc.sqrt(x);
        }
}

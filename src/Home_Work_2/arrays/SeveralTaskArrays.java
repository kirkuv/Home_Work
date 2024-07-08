package Home_Work_2.arrays;

import Home_Work_2.utils.ArraysUtils;
import Home_Work_2.utils.ConsoleUtil;

import java.util.Arrays;

/**
 * 2.4 Задачи в презентации. На сайте есть пояснения по каждой из этих задач.
 * Все задачи в одном классе, в отдельных методах.
 * Для получения массивов вызывать ранее созданный метод arrayRandom (ArraysUtils.arrayRandom(50, 100))
 * 		2.4.1. Сумма четных положительных элементов массива
 * 		2.4.2. Максимальный из элементов массива с четными индексами
 * 		2.4.3. Элементы массива, которые меньше среднего арифметического
 * 		2.4.4. Найти два наименьших (минимальных) элемента массива
 * 		2.4.5. Сжать массив, удалив элементы, принадлежащие интервалу
 * 		2.4.6. Сумма цифр массива
 */
public class SeveralTaskArrays {
    public static void main(String[] args) {
        int[] container = ArraysUtils.arrayRandom(50,100);
        System.out.println("++++++++++++++++++ поехали (2.4.1)++++++++++++++++");
        System.out.println(sumPozitiv(container));
        System.out.println("++++++++++++++++++Дальше поехали (2.4.2)++++++++++++++++");
        System.out.println(maxElement(container));
        System.out.println("++++++++++++++++++ЕЩЕ Дальше поехали (2.4.3)++++++++++++++++");
        System.out.println(lessThanTheArithmeticMean(container));
        System.out.println("++++++++++++++++++ЕЩЕ вот немного Дальше поехали (2.4.4)++++++++++++++++");
        System.out.println(twoMinimalElements(container));
        System.out.println("++++++++++++++++++ЕЩЕ вот немного, капелюшка Дальше поехали (2.4.5)++++++++++++++++");
        System.out.println("Проверка идет в промежутке от 5 до 47 "+ compressArray(container));
        System.out.println("++++++++++++++++++ Ну все вроде последняя (2.4.6)++++++++++++++++");
        System.out.println("Сумма цифр массива "+ sumMas(container));
    }
    public static int sumPozitiv (int [] array ){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 ==0)
                sum +=array[i];
        }
    return sum;}
    public static int maxElement (int [] array){
        int a = -1;
        for (int i = 0; i < array.length; i+=2) {
            if (array[i] > a) {
                a = array[i];
            }
        }
        return a;

    }
    public static String lessThanTheArithmeticMean (int [] array){
        StringBuilder builder = new StringBuilder();
        int sum = 0;
        double average ;

        for (int value : array) {
            sum += value;
        }
        average = 1.0 * sum / array.length;

        for (int value : array) {
            if (value < average) {
                builder.append(value);
                builder.append(" ");
            }
        }
        return builder.toString().trim();
    }
    public static String twoMinimalElements (int [] array){
        int[] i = array;
        Arrays.sort(array);
        for (int values : array) {
        }
    return array[0] + ", " + array[1];
    }
    public static String compressArray (int [] array){
        int j = 0;
        int a = 5;
        int b = 47;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < a || array[i] > b) { // инвертировать условие
                array[j++] = array[i]; // перенести число, не входящее в исключаемый диапазон
            }
        }
        while (j < array.length) {
            array[j++] = 0;
        }
    return Arrays.toString(array);
    }
    public static int sumMas (int [] array){
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            while (array[i] > 0) {
                sum += array[i] % 10;
                array[i] /= 10;
            }
        }

        return sum;
    }
}

package Home_Work_2.utils;

import java.util.Random;

/** Написать метод public static int[] arrayFromConsole().
 * Данный метод размер массива и каждый его элемент запрашивает у пользователя через консоль.
 2.1.1.1. Пример в отдельном классе с main. int[] container = arrayFromConsole().
 Результат: В методе arrayFromConsole будет запрошена информация у пользователя,
 пользователь вводит размер (3) и его элементы по порядку {4, 17, 32}.
 Соответсвенно будет создан массив размером 3 с элементами {4, 17, 32} и сохранён в переменную container.

 2.1.2. Написать метод public static int[] arrayRandom(int size, int maxValueExclusion).
 Данный метод принимает два аргумента. Первый (size) указывает размер массива который мы хотим получить.
 Второй (maxValueExclusion) указывает до какого числа генерировать рандомные числа.
 2.1.2.1. Пример в отдельном классе с main. int[] container = arrayRandom(5, 100).
 Результат: В методе arrayRandom будет создан массив размером 5 с числами от 0 до 99 (использовать класс Random)
 и сохранён в переменную container.
 */
public class ArraysUtils {
    public static int[] arrayFromConsole() {
        System.out.print("Введите размер массива: ");
        int size = Integer.parseInt(ConsoleUtil.inputFromConsole());
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("и его значения по порядку " + i + "-го элемента массива: ");
            array[i] = Integer.parseInt(ConsoleUtil.inputFromConsole());
        }
        return array;
    }
    public static int[] arrayRandom(int size, int maxValueExclusion) {
        int[] array = new int[size];
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(maxValueExclusion);
        }
        return array;
    }
}

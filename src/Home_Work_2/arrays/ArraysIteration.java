package Home_Work_2.arrays;

import Home_Work_2.utils.ArraysUtils;

/**
 * 2.2 Создать класс ArraysIteration. В этом классе написать перебор (итерирование) массива
 * при помощи do....while, while, for, foreach.
 * Вызывая ранее созданный метод arrayFromConsole (ArraysUtils.arrayFromConsole()) получить массив.
 * Все задачи в одном классе, в отдельных методах, в каждом методе используется 4 разных цикла. Должно получиться 3 метода:
 * 		2.2.1. Вывести все элементы в консоль.
 * 		2.2.2. Вывести каждый второй элемент массива в консоль.
 * 		2.2.3. Вывести все элементы массива в консоль в обратном порядке.
 */
public class ArraysIteration {
    public static void main(String[] args) {
        int[] container = ArraysUtils.arrayFromConsole();
        //System.out.println(printToConsole(container));
        ////System.out.println("\n++++++++++++++++++Перемещаемся в дугой метод+++++++++++++++++++++\n");
       // System.out.println(printEverySecondElement(container));
       // System.out.println("\n++++++++++++++++++Перемещаемся в дугой метод+++++++++++++++++++++\n");
       // System.out.println(reversePrint(container));

    }
    public static String printToConsole(int[] array) {
        StringBuilder builder = new StringBuilder();

        builder.append("________ do...while_________\n");
        int i = 0;
        do {
            builder.append(array[i]);
            if (i < array.length - 1) {
                builder.append(", ");
            }
            i++;
        } while(i < array.length);

        //builder.append("\n_________while_________\n");
        i = 0;
        while (i < array.length) {
            builder.append(array[i]);
            if (i < array.length - 1) {
                builder.append(", ");
            }
            i++;
        }

        //builder.append("\n_____________for__________\n");
        for (i = 0; i < array.length; i++) {
            builder.append(array[i]);
            if (i < array.length - 1) {
                builder.append(", ");
            }
        }

        //builder.append("\n____________foreach___________\n");
        i = 0;
        for(int value : array) {
            builder.append(value);
            if (i < array.length - 1) {
                builder.append(", ");
            }
            i++;
        }

        return builder.toString().trim();
    }
    public static String printEverySecondElement(int[] array) {
        StringBuilder builder = new StringBuilder();

        //builder.append("________ do...while_________\n");
        int i = 0;
        do {
            builder.append(array[i]);
            if (i < array.length - 2) {
                builder.append(", ");
            }
            i+=2;
        } while(i < array.length);

       // builder.append("\n____________while_________\n");
        i = 0;
        while (i < array.length) {
            builder.append(array[i]);
            if (i < array.length - 2) {
                builder.append(", ");
            }
            i+=2;
        }

       // builder.append("\n_______________ for_______________\n");
        for (i = 0; i < array.length; i+=2) {
            builder.append(array[i]);
            if (i < array.length - 2) {
                builder.append(", ");
            }
        }

       // builder.append("\n________________foreach______________\n");
        i = 0;
        for(int value : array) {
            if (i % 2 == 0) {
                builder.append(value);
                if (i < array.length - 2) {
                    builder.append(", ");
                }
            }
            i++;
        }

        return builder.toString();
    }

    public static String reversePrint(int[] array) {
        StringBuilder builder = new StringBuilder();

       // builder.append("________ do...while_________\n");
        int i = array.length - 1;
        do {
            builder.append(array[i]);
            if (i > 0) {
                builder.append(", ");
            }
            i--;
        } while(i >= 0);

      //  builder.append("\n______________while_________\n");
        i = array.length - 1;
        while (i >= 0) {
            builder.append(array[i]);
            if (i > 0) {
                builder.append(", ");
            }
            i--;
        }

        //builder.append("\n________for________________\n");
        for (i = array.length - 1; i >= 0; i--) {
            builder.append(array[i]);
            if (i > 0) {
                builder.append(", ");
            }
        }

        //builder.append("\n________________foreach____________\n");
        int[] reverseArray = new int[array.length];
        i = array.length - 1;
        for(int value : reverseArray) {
            value = array[i];
            builder.append(value);
            if (i > 0) {
                builder.append(", ");
            }
            i--;
        }

        return builder.toString();
    }

}

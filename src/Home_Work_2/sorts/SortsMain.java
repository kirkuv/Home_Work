package Home_Work_2.sorts;

import Home_Work_2.utils.ArraysUtils;
import Home_Work_2.utils.SortsUtils;

/*
Создать класс SortsMain. Все проверки пишутся в main.
		4.2.1. После каждого теста в консоль вы должны распечатать сообщение формата
		"[Какой массив был до сортировки] -> [Каким стал массив после сортировки]".
		 Для преобразования массива в текст можно использовать класс Arrays.
		4.2.2. Для тестов используем предварительно созданные массивы:
			4.2.2.1. new int[]{1,2,3,4,5,6}
			4.2.2.2. new int[]{1,1,1,1}
			4.2.2.3. new int[]{9,1,5,99,9,9}
			4.2.2.4. new int[]{}
			4.2.2.5. new int[]{6,5,4,3,2,1}
		4.2.2 После предварительных тестов пишем тест с рандомным заполнением массива.
		Вызывая ранее созданный метод arrayRandom (ArraysUtils.arrayRandom(50, 100)) получить массив. Отсортировать.
		4.2.3 После теста с рандомно заполненным массивом пишем тест с массивом полученным через консоль.
		Вызывая ранее созданный метод arrayFromConsole (ArraysUtils.arrayFromConsole()) получить массив. Отсортировать.

 */
public class SortsMain {
    public static void main(String[] args) {
        int [] arr1;
        int [] arr = new int[]{1,2,3,4,5,6};
        System.out.println("массив был до сортировки "+ "["+ ArraysUtils.arrayToString(arr) +"]");
        SortsUtils.sort(arr);
        System.out.println("массив после сортировки (пузырьковая) "+ "["+ ArraysUtils.arrayToString(arr) +"]");
        arr = new int[]{1,2,3,4,5,6};
        SortsUtils.shake(arr);
        System.out.println("массив был до сортировки "+ "["+ ArraysUtils.arrayToString(arr) +"]");
        System.out.println("массив после сортировки (Шейкер) "+ "["+ ArraysUtils.arrayToString(arr) +"]");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        arr = new int[]{1,1,1,1};
        System.out.println("массив был до сортировки "+ "["+ ArraysUtils.arrayToString(arr) +"]");
        SortsUtils.sort(arr);
        System.out.println("массив после сортировки (пузырьковая) "+ "["+ ArraysUtils.arrayToString(arr) +"]");
        arr = new int[]{1,1,1,1};
        System.out.println("массив был до сортировки "+ "["+ ArraysUtils.arrayToString(arr) +"]");
        SortsUtils.shake(arr);
        System.out.println("массив после сортировки (Шейкер) "+ "["+ ArraysUtils.arrayToString(arr) +"]");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        arr =new int[]{9,1,5,99,9,9};
        System.out.println("массив был до сортировки "+ "["+ ArraysUtils.arrayToString(arr) +"]");
        SortsUtils.sort(arr);
        System.out.println("массив после сортировки (пузырьковая) "+ "["+ ArraysUtils.arrayToString(arr) +"]");
        arr =new int[]{9,1,5,99,9,9};
        System.out.println("массив был до сортировки "+ "["+ ArraysUtils.arrayToString(arr) +"]");
        SortsUtils.shake(arr);
        System.out.println("массив после сортировки (Шейкер) "+ "["+ ArraysUtils.arrayToString(arr) +"]");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        arr = new int[]{};
        System.out.println("массив был до сортировки "+ "["+ ArraysUtils.arrayToString(arr) +"]");
        SortsUtils.sort(arr);
        System.out.println("массив после сортировки (пузырьковая) "+ "["+ ArraysUtils.arrayToString(arr) +"]");

        arr = new int[]{};
        System.out.println("массив был до сортировки "+ "["+ ArraysUtils.arrayToString(arr) +"]");
        SortsUtils.shake(arr);
        System.out.println("массив после сортировки (Шейкер) "+ "["+ ArraysUtils.arrayToString(arr) +"]");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        arr = new int[]{6,5,4,3,2,1};
        System.out.println("массив был до сортировки "+ "["+ ArraysUtils.arrayToString(arr) +"]");
        SortsUtils.sort(arr);
        System.out.println("массив после сортировки (пузырьковая) "+ "["+ ArraysUtils.arrayToString(arr) +"]");

        arr = new int[]{6,5,4,3,2,1};
        System.out.println("массив был до сортировки "+ "["+ ArraysUtils.arrayToString(arr) +"]");
        SortsUtils.shake(arr);
        System.out.println("массив после сортировки (Шейкер) "+ "["+ ArraysUtils.arrayToString(arr) +"]");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


        System.out.println("+++++++++++++++++++++++Дальше ТЕСТИМ на рандоме++++++++++++++++++++++");
        arr = ArraysUtils.arrayRandom(50,100);
        System.out.println("массив был до сортировки "+ "["+ ArraysUtils.arrayToString(arr) +"]");
        SortsUtils.sort(arr);
        System.out.println("массив после сортировки (пузырьковая) "+ "["+ ArraysUtils.arrayToString(arr) +"]");

        arr = ArraysUtils.arrayRandom(50,100);
        System.out.println("массив был до сортировки "+ "["+ ArraysUtils.arrayToString(arr) +"]");
        SortsUtils.shake(arr);
        System.out.println("массив после сортировки (Шейкер) "+ "["+ ArraysUtils.arrayToString(arr) +"]");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        arr =  ArraysUtils.arrayFromConsole();
        System.out.println("массив был до сортировки "+ "["+ ArraysUtils.arrayToString(arr) +"]");
        SortsUtils.sort(arr);
        System.out.println("массив после сортировки (пузырьковая) "+ "["+ ArraysUtils.arrayToString(arr) +"]");

        arr =  ArraysUtils.arrayFromConsole();
        System.out.println("массив был до сортировки "+ "["+ ArraysUtils.arrayToString(arr) +"]");
        SortsUtils.shake(arr);
        System.out.println("массив после сортировки (Шейкер) "+ "["+ ArraysUtils.arrayToString(arr) +"]");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

    }
}

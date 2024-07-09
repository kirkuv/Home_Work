package Home_Work_2.arrays;

import Home_Work_2.utils.ArraysUtils;

public class ArrayFromConsole {
    public static void main(String[] args) {
        int[] array = ArraysUtils.arrayFromConsole();

        System.out.println(ArraysUtils.arrayToString(array));
    }
}

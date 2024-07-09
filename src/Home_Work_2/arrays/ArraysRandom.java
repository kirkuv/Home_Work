package Home_Work_2.arrays;

import Home_Work_2.utils.ArraysUtils;

public class ArraysRandom {
    public static void main(String[] args) {
        int[] array = ArraysUtils.arrayRandom(5,100);

        System.out.println(ArraysUtils.arrayToString(array));
    }
}

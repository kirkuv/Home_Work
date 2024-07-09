package Home_Work_2.utils;

public class SortsUtils {
    public static void sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
    public static void shake(int[] arr){
        int left = 0;
        int right  = arr.length-1;
        boolean move = true;
        while ((left<right ) && move)
        {
            move = false;
            for (int i = left; i < right ; i++) {
                if (arr[i]>arr[i+1])
                {
                    int tmp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1] = tmp;
                    move = true;
                }
            }
            right --;
            for (int i = right ; i > left; i--) {
                if (arr[i-1]>arr[i]){
                    int tmp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = tmp;
                    move = true;
                }
            }
            left++;
        }
    }
}

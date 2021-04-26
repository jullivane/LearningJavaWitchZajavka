package week_03__days_15_21.day_18_arrays;

import java.util.Arrays;

// Napisz program, który odwróci kolejność elementów w tablicy.
public class Task3_ArrayReverse {

    private static int[] reverse(int[] array){
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse(new int[]{1,2,3,4,5})));
    }
}

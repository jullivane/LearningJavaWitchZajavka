package week_03__days_15_21.day_18_arrays;

// Napisz program, który znajdzie druga największą wartość w tablicy.
public class Task7_SecondLargest {

    public static int findSecondLargestNumber(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++)
                if (array[j - 1] > array[j]) {
                    int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            if (array[array.length - 1] > array[array.length - 1 - i])
                return array[array.length - 1 - i];
        }
        return array[-1]; // if second largest not found, throws ArrayIndexOutOfBoundException
    }

    public static void main(String[] args) {
        System.out.println(findSecondLargestNumber(new int[]{1,0,2,0,-1}));
    }
}

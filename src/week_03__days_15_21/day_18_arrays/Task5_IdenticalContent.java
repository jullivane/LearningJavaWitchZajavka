package week_03__days_15_21.day_18_arrays;

// Napisz program, który porówna ze sobą zawartość dwóch tablic i wydrukuje na ekranie, czy zawartość jest taka sama.
// Kolejność wejściowa elementów nie ma znaczenia. Liczy się tylko zawartość,
// np. [2, 6, 1, 12] == [12, 6, 1, 2] ale [2, 6, 1, 12] != [12, 6, 1, 3]

public class Task5_IdenticalContent {

    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++)
                if (array[j - 1] > array[j]) {
                    int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
        }
        return array;
    }

    private static boolean checkIdenticalContent(int[] array1, int[] array2){
        if (array1.length!=array2.length)
            return false;
        int[] array1_sorted = bubbleSort(array1);
        int[] array2_sorted = bubbleSort(array2);
        for (int i=0; i<array1_sorted.length; i++){
            if (array1_sorted[i]!=array2_sorted[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] myArray1 = new int[]{0,1,0,2,0,3,0,4,0,5,0};
        int[] myArray2 = new int[]{0,0,0,0,0,0,1,2,3,4,5};
        int[] myArray3 = new int[]{1,2,3,4,5,0,0,0,0,0,0};
        int[] myArray4 = new int[]{0,1,0,2,0,3,0,4,0,5};
        int[] myArray5 = new int[]{0,1,2,3,4,5};
        System.out.println(checkIdenticalContent(myArray1, myArray2)); // true
        System.out.println(checkIdenticalContent(myArray1, myArray3)); // true
        System.out.println(checkIdenticalContent(myArray1, myArray4)); // false
        System.out.println(checkIdenticalContent(myArray1, myArray4)); // false
    }

}

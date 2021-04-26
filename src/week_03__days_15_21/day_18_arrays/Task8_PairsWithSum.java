package week_03__days_15_21.day_18_arrays;

public class Task8_PairsWithSum {

    private static void findPairsWithSum(int[] array, int sum) {
        for (int i = 0; i < array.length; i++)
            for (int j = i + 1; j < array.length; j++)
                if (array[i]+array[j]==sum)
                    System.out.println(array[i]+", "+array[j]);
    }

    public static void main(String[] args) {
        findPairsWithSum(new int[]{1,2,3,4},5);
    }
}

package week_03__days_15_21.day_18_arrays;

import java.util.Arrays;

// Napisz program, który znajdzie w tablicy zduplikowane elementy i stworzy z nich tablicę. Kolejność nie ma znaczenia.
public class Task4_DuplicatedValues {

    public static int[][] countOccurrences(int[] array) {
        int[][] occurrences = new int[array.length][2];
        int occurrences_maxIndex = 0;
        boolean foundZeroInArray = false;
        for (int val : array) {
            boolean valueAlreadyInOccurrencesArray = false;
            // ponizej warunek !valueAlreadyInOccurrencesArray jest po to ze jesli w tablicy occurrences znajdzie
            // obecnie przerabiana wartosc to zeby zakonczyl szukanie tej wartosci
            // nie wystarczy tu zaden break, trzeba zakonczyc wykonywanie wewnetrzenj petli
            for (int j = 0; j <= occurrences_maxIndex && !valueAlreadyInOccurrencesArray; j++)
                if (occurrences[j][0] == val) {
                    occurrences[j][1]++;
                    if (val == 0 && !foundZeroInArray) {
                        occurrences_maxIndex++;
                        foundZeroInArray = true;
                    }
                    valueAlreadyInOccurrencesArray = true;
                }
            if (!valueAlreadyInOccurrencesArray) {
                occurrences[occurrences_maxIndex][0] = val;
                occurrences[occurrences_maxIndex][1]++;
                occurrences_maxIndex++;
            }
        }
        return Arrays.copyOf(occurrences, occurrences_maxIndex);
    }

     private static int[] getDuplicatesFromOccurences(int[][] occurrences){
        int[] duplicates = new int[occurrences.length];
        int duplicates_maxIndex=0;
        for (int[] occ : occurrences) {
            if (occ[1] > 1) {
                duplicates[duplicates_maxIndex] = occ[0];
                duplicates_maxIndex++;
            }
        }
        return Arrays.copyOf(duplicates, duplicates_maxIndex);
    }

    public static void main(String[] args) {
        int[] myArray = new int[]{0,1,0,2,0,3,0,4,0,5,0};
        int[][] occurrences = countOccurrences(new int[]{0,1,0,2,0,3,0,4,0,5,0});
        int[] duplicates = getDuplicatesFromOccurences(occurrences);
        System.out.println("\t  array:\t"+Arrays.toString(myArray));
        System.out.print("occurrences:\t");
        for (int[] occurrence : occurrences) System.out.print(Arrays.toString(occurrence) + ", ");
        System.out.println();
        System.out.println(" duplicates:\t"+Arrays.toString(duplicates));

    }
}

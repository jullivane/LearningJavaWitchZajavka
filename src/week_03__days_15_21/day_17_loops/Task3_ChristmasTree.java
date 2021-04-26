package week_03__days_15_21.day_17_loops;

// Napisz program, który na ekranie wydrukuje choinkę z podanych przez Ciebie znaków
// przy czym parametrem wejściowym jest ilość znaków w podstawie.
// Do tego, żeby to wyglądało jak choinka, to w każdym kolejnym rzędzie
// idąc z dołu do góry musi być o 2 znaki mniej niż w rzędzie poprzednim.
// Do tego załóż, że jak w podstawie jest liczba parzysta,
// to na samej górze zostają 2 znaki, a jak nieparzysta to jeden. Przykład:
//     #           ##
//    ###         ####
//   #####       ######
//  #######     ########
// #########   ##########

public class Task3_ChristmasTree {

    private static void printChristmasTree(char sign, int numOfSignsAtTheBottom) {
        int currentNumOfSpaces = (numOfSignsAtTheBottom + 1) / 2; // 0:0, 2:0, 3:1, 4:1, 5:2, 6:2, 7:3, 8:3, ...
        int currNumOdSigns = (numOfSignsAtTheBottom - 1) % 2 + 1; // 0:0, 1:1, 2:2, 3:1, 4:2, 5:1, 6:2, 7:1, 8:2, ...
        for (int i = 0; i < (numOfSignsAtTheBottom + 1) / 2; i++) {
            for (int j = 0; j < currentNumOfSpaces; j++)
                System.out.print(" ");
            for (int j = 0; j < currNumOdSigns; j++)
                System.out.print(sign);
            System.out.println();
            currentNumOfSpaces--;
            currNumOdSigns += 2;
        }
    }

    public static void main(String[] args) {
        printChristmasTree('#',10);
    }
}

package week_03__days_15_21.day_17_loops;

// Napisz program drukujący ciąg znaków jak poniżej. Napisz to tak, żeby liczenie doszło do 999.
// Postaraj się wykorzystać pętle zagnieżdżone, tzn. nie pisz czegoś takiego: System.out.println("####);
//111
//####
//####
//####
//####
//222
//####
//####
//####
//####

public class Task8_NestedLoops {
    public static void main(String[] args) {
        for (int i=1; i<10; i++){
            for(int j=0; j<3; j++)
                System.out.print(i);
            System.out.println();
            for (int j=0; j<4; j++){
                for(int k=0;k<4; k++)
                    System.out.print("#");
                System.out.println();
            }
        }
    }
}

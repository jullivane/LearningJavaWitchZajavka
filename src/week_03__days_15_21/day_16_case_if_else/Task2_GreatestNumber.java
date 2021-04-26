package week_03__days_15_21.day_16_case_if_else;

// Napisz program, który określi która z 3 podanych liczb jest największa.
public class Task2_greatestNumber {

    private static int greatestNumber(int a, int b, int c){
        int greatest = a;
        if (b>greatest)
            greatest=b;
        if (c>greatest)
            greatest=c;
        return greatest;
    }
    public static void main(String[] args) {
        int a=3, b=17, c=13;
        System.out.format("Sposrod liczb %d, %d, %d najwieksza jest: %d\n", a,b,c,greatestNumber(a,b,c));
    }
}

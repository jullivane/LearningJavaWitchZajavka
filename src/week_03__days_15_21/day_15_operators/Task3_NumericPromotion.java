package week_03__days_15_21.day_15_operators;

// Napisz program, w którym zaczynając od zmiennej byte x = 0
// będziesz mógł otrzymać int, long, float oraz double stosując promocję numeryczną.
//
// z PJWSTK (https://edu.pjwstk.edu.pl/wyklady/ppj/scb/TypyOp/TypyOp.html):
// Promocja numeryczna polega na przekształceniu typów argumentów operatorów arytmetycznych do typu wspólnego dla ich argumentów

public class Task3_NumericPromotion {

    public static void main(String[] args) {
        byte x = 0;
        int s = x + 1;
        long l = x + 2L;
        float f = 4.2f;
        double d = x + 2.0;
        System.out.format("%d\t%d\t%d\t%f\t%f", x, s, l, f, d);
    }
}

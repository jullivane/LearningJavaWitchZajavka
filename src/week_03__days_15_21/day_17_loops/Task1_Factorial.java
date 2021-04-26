package week_03__days_15_21.day_17_loops;

// Napisz program liczący silnię. Spróbuj dokonać takiej implementacji przy wykorzystaniu oddzielnie pętli oraz oddzielnie rekurencji.
public class Task1_Factorial {

    private static int silniaPetla(int n) {
        int silnia = 1;
        for (int i = 2; i <= n; i++) {
            silnia *= i;
        }
        return silnia;
    }

    private static int silniaRrekurencyjnie(int n) {
        if (n<=1)
            return 1;
        return n*silniaRrekurencyjnie(n-1);
    }

    public static void main(String[] args) {
        System.out.println(silniaPetla(3));
        System.out.println(silniaRrekurencyjnie(3));
    }
}

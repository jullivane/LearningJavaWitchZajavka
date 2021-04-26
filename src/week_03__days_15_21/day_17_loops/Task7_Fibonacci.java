package week_03__days_15_21.day_17_loops;

// Napisz program drukujący na ekranie ciąg Fibonacciego. Wydrukuj pierwsze 20 znaków ciągu. Znaki ciągu możesz oddzielić spacją.
public class Task7_Fibonacci {

    static int fibonacci_recursive(int n){
        if (n<=1)
            return n;
        return fibonacci_recursive(n-1)+fibonacci_recursive(n-2);
    }

    static void fibonacci_loop(int n) {
        int a = 1, b = 1, tmp;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            tmp = b;
            b += a;
            a = tmp;
        }
    }

    public static void main(String[] args) {
        fibonacci_loop(10);
        System.out.println();
        System.out.println(fibonacci_recursive(10));
    }
}

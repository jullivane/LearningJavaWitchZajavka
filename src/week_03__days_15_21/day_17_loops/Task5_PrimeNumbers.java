package week_03__days_15_21.day_17_loops;

// Napisz program, który wydrukuje wszystkie liczby pierwsze od 2 do 10000.
public class Task5_PrimeNumbers {

    private static void primeNumbers(int maxValue) {
        for (int i = 2; i <= maxValue; i += 2) {
            if (isPrime(i))
                System.out.println(i);
            if (i == 2)
                i--; // i=2 -> i=1 -> i=3
        }
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;
        return true;
    }

    public static void main(String[] args) {
        primeNumbers(1000);
    }
}

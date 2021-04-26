package week_03__days_15_21.day_16_case_if_else;

// Napisz program, który sprawdzi czy dana liczba jest parzysta i wydrukuj na ekranie PARZYSTA lub NIEPARZYSTA.
public class Task3_EvenOrOdd {

    public static void main(String[] args) {
        int a = 13;
        String out = "PARZYSTA";
        if (a % 2 != 0) out = "NIE" + out;

        System.out.format("Liczba %d jest %s\n", a, out);
        System.out.println("Liczba " + (a+3) + " jest " + out);
    }
}

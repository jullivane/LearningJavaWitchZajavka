package week_03__days_15_21.day_15_operators;

// Napisz metodę, która przyjmuje 2 liczby double, wydrukuje ich sumę, różnicę, iloczyn oraz iloraz.
public class Task1_sum {

    public static void add_sub_mult_div(double a, double b) {
        System.out.format("suma\t%f + %f = %f\n", a, b, a + b);
        System.out.format("różn.\t%f - %f = %f\n", a, b, a - b);
        System.out.format("ilocz.\t%f * %f = %f\n", a, b, a * b);
        System.out.format("ilor.\t%f / %f = %f\n", a, b, a / b);
    }

    public static void main(String[] args) {
        double a = 5.5, b = 3.0;
        add_sub_mult_div(a, b);
    }

}

package week_03__days_15_21;

public class Task1 {
//1. Napisz metodę, która przyjmuje 2 liczby double, wydrukuje ich sumę, różnicę, iloczyn oraz iloraz.

    public static void task_06__cut_out_3_8(double a, double b) {
        System.out.format("suma\t%f + %f = %f\n", a, b, a + b);
        System.out.format("różn.\t%f - %f = %f\n", a, b, a - b);
        System.out.format("ilocz.\t%f * %f = %f\n", a, b, a * b);
        System.out.format("ilor.\t%f / %f = %f\n", a, b, a / b);
    }

    public static void main(String[] args) {
        double a = 5.5, b = 3.0;
        task_06__cut_out_3_8(a, b);
    }

}

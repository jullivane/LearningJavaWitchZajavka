package week_03__days_15_21.day_15_operators;

//5. Napisz metodę, która jako argument przyjmuje liczbę i wydrukuje informację
//   czy metoda jest podzielna przed 3, przez 7 oraz przez 3 i 7 jednocześnie
public class Task5_Divisibility {

    public static void task_05__modulo_3_7(int value){
        System.out.format("Czy liczba %d jest podzielna przez:\n", value);
        System.out.format("\t7?\t%b\n", value%7==0);
        System.out.format("\t3?\t%b\n", value%3==0);
        System.out.format("\t7 oraz 3?\t%b\n\n", value%7==0 && value%3==0);
    }

    public static void main(String[] args) {
        task_05__modulo_3_7(1);
        task_05__modulo_3_7(3);
        task_05__modulo_3_7(7);
        task_05__modulo_3_7(21);
        task_05__modulo_3_7(42);
        task_05__modulo_3_7(43);
    }
}

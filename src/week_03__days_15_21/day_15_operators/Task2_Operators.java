package week_03__days_15_21.day_15_operators;

//2. Napisz program w którym użyjesz operatorów ==, !, !=, ++, -=, *=.
//   Na początku masz zadeklarowaną zmienną int x = 0.
//   Podczas pisania programu nie możesz zadeklarować żadnej innej zmiennej,
//   tzn. przez cały czas pisania programu możesz operować tylko na tej jednej zmiennej.
public class Task2_Operators {

    public static void main(String[] args) {
        int x = 0;
        System.out.format("!(%d == %d)  : %b\n", x, x, !(x == x++));
        System.out.format("%d != ++%d  : %b\n", x, x, x != ++x);
        System.out.format("%d -= %d = %d\n", x, x, x *= x);
        System.out.format("%d -= %d = %d\n", x, x, x -= x);

    }
}

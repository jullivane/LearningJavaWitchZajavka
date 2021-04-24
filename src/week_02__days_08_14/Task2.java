package week_02__days_08_14;

public class Task2 {
// 2. Napisz program, który sklei ze sobą 5 dowolnych stringów na 2 pokazane różne sposoby i wydrukuje rezultat na ekranie.

    public static String task_02__text_plus_text(String text1, String text2, String text3, String text4, String text5) {
        return text1 + text2 + text3 + text4 + text5;
    }

    public static String task_02__text_concat(String text1, String text2, String text3, String text4, String text5) {
        return text1.concat(text2).concat(text3).concat(text4).concat(text5);
    }

    public static void main(String[] args) {
        System.out.println(task_02__text_plus_text("Ala ", "ma ", "kota ", "i ", "psa."));
        System.out.println(task_02__text_concat("Ala ", "ma ", "kota ", "i ", "psa."));

    }
}

package week_02__days_08_14;

public class Task2 {
// 2. Napisz program, który sklei ze sobą 5 dowolnych stringów na 2 pokazane różne sposoby i wydrukuje rezultat na ekranie.

    public static void main(String[] args) {
        String text1 = "Ala ";
        String text2 = "ma ";
        String text3 = "kota ";
        String text4 = "i ";
        String text5 = "psa.";
        
        System.out.println(text1 + text2 + text3 + text4 + text5);
        System.out.println(text1.concat(text2).concat(text3).concat(text4).concat(text5));
    }
}

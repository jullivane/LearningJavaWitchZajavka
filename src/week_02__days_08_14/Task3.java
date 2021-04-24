package week_02__days_08_14;

public class Task3 {
// 3. Napisz program, który zamieni samogłoski w podanym zdaniu na podaną przez Ciebie liczbę zmiennoprzecinkową.

    public static String task_03__vovels_to_double(String text, double value){
        String[] vowels = new String[] {"a","e","i","o","u","y"};
        for (String vowel : vowels) text = text.replaceAll(vowel, "" + value);
        return text;
    }

    public static void main(String[] args) {
        System.out.println(task_03__vovels_to_double("Ala ma kota", 5.184));
    }
}

package week_02__days_08_14;

// 3. Napisz program, który zamieni samogłoski w podanym zdaniu na podaną przez Ciebie liczbę zmiennoprzecinkową.
public class Task3_VowelsToValue {

    public static void main(String[] args) {
        String[] vowels = new String[] {"a","e","i","o","u","y"};
        String text = "Ala ma kota";
        double value = 5.184;
        
        for (String vow : vowels) text = text.replaceAll(vow, "" + value);
        System.out.println(text);
    }
}

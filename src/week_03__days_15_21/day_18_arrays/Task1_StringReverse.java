package week_03__days_15_21.day_18_arrays;

// Napisz program, który odwróci zawartość Stringa tyłem do przodu.
public class Task1_StringReverse {
    private static String reverse(String text) {
        char[] textArray = text.toCharArray();
        for (int i = 0; i < textArray.length / 2; i++) {
            char tmp = textArray[i];
            textArray[i] = textArray[textArray.length - 1 - i];
            textArray[textArray.length - 1 - i] = tmp;
        }
        return new String(textArray);
    }

    public static void main(String[] args) {
        System.out.println(reverse("abcdefg"));
    }
}

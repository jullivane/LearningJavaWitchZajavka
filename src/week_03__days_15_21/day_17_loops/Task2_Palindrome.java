package week_03__days_15_21.day_17_loops;

// Napisz program, który określi czy podane słowo jest palindromem.
public class Task2_Palindrome {

    private static boolean isPalindrome(String text) {
        text = text.replaceAll(" ", "");
        boolean isPalindrome = true;
        for (int i = 0; i < text.length() / 2 && isPalindrome; i++)
            if (text.charAt(i)!=text.charAt(text.length()-1-i))
                isPalindrome = false;
        return isPalindrome;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("kajak")); // true
        System.out.println(isPalindrome("jojo")); // false
        System.out.println(isPalindrome("moze jutro ta dama sama da tortu jezom")); // true
    }

}

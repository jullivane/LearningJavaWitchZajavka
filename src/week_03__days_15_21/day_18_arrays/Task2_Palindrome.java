package week_03__days_15_21.day_18_arrays;

// Napisz program, który sprawdzi, czy podany ciąg znaków jest palindromem. Tym razem wykorzystaj tablice.
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

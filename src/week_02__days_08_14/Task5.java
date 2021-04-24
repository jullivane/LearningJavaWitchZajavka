package week_02__days_08_14;

public class Task5 {
// 5. Napisz program, który porówna 2 stringi w taki sposób żeby wynik "Java".equals("jaVa") zwrócił ‘true’.

    public static boolean task_05__equals(String text1, String text2){
        return text1.toLowerCase().equals(text2.toLowerCase());
    }

    public static void main(String[] args) {
        System.out.println(task_05__equals("Java","jaVa"));
    }
}

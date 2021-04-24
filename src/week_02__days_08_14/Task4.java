package week_02__days_08_14;

public class Task4 {
// 4. Napisz program, który będzie sprawdzał, czy w podanym zdaniu występuje słowo 'Java'.

    public static boolean task_04__does_contain(String text_to_check, String value){
        return text_to_check.contains(value);
    }

    public static void main(String[] args) {
        System.out.println(task_04__does_contain("Ala ma kota","Java"));
        System.out.println(task_04__does_contain("Java jest super","Java"));
    }
}

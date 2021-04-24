package week_02__days_08_14;

public class Task6 {
// 6. Napisz program, który z podanego Stringa o długości dłuższej niż 10 znaków,
//    wytnie string od indeksu 3 o długości 5 znaków.
//    Czyli np. dla stringa "SomeStringLongerThan10Signs" otrzymamy “eStri"

    public static String task_06__cut_out_3_8(String text){
        if (text.length()>10)
            text = text.substring(0,3).concat(text.substring(8, text.length()));
        return text;
    }

    public static void main(String[] args) {
        System.out.println(task_06__cut_out_3_8("01234567890123456789"));
    }
}

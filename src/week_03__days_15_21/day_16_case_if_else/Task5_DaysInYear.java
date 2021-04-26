package week_03__days_15_21.day_16_case_if_else;

// Napisz switch, który policzy dla podanego numeru miesiąca, ile dni minęło od początku roku, do końcowego dnia podanego miesiąca. Załóż, że luty ma 28 dni.
// 1: 31, 2: 28, 3: 31, 4: 30, 5: 31, 6: 30, 7: 31, 8: 31, 9:30, 10: 31, 11: 30, 12:31
public class Task5_DaysInYear {

    private static int howManyDaysInYearUntilTheEndOfTheMonth(int monthNumber){
        int days = 0;
        switch (monthNumber){
            case 1:
                days = 31;
                break;
            case 2:
                days = 31+28;
                break;
            case 3:
                days = 31+28+31;
                break;
            case 4:
                days = 31+28+31+30;
                break;
            case 5:
                days = 31+28+31+30+31;
                break;
            case 6:
                days = 31+28+31+30+31+30;
                break;
            case 7:
                days = 31+28+31+30+31+30+31;
                break;
            case 8:
                days = 31+28+31+30+31+30+31+31;
                break;
            case 9:
                days = 31+28+31+30+31+30+31+31+30;
                break;
            case 10:
                days = 31+28+31+30+31+30+31+31+30+31;
                break;
            case 11:
                days = 31+28+31+30+31+30+31+31+30+31+30;
                break;
            case 12:
                days = 31+28+31+30+31+30+31+31+30+31+30+31;
                break;
        }
        return days;
    }

    public static void main(String[] args) {
        int monthNumber = 12;
        System.out.println("Od poczatku roku do konca "+monthNumber+". miesiaca jest "+howManyDaysInYearUntilTheEndOfTheMonth(monthNumber)+" dni.");
    }
}

package week_03__days_15_21.day_16_case_if_else;

public class Task4_DaysInMonth {
// Napisz program, który na podstawie podanego numeru miesiąca, wydrukuje ile w takim miesiącu mamy dni.
// W przypadku podania złej liczby dni, wydrukuje "Nie ma takiego miesiąca". Użyj switch.
// 1: 31, 2: 28, 3: 31, 4: 30, 5: 31, 6: 30, 7: 31, 8: 31, 9:30, 10: 31, 11: 30, 12:31

    private static int howManyDaysInMonth(int monthNumber){
        int days = 0;
        switch (monthNumber){
            case 1,3,5,7,8,10,12:
                days = 31;
                break;
            case 4,6,9,11:
                days = 30;
                break;
            case 2:
                days = 28;
                break;
        }
        return days;
    }
    public static void main(String[] args) {
        int monthNumber = 2;
        System.out.println("W "+monthNumber+". miesiacu roku jest "+howManyDaysInMonth(monthNumber)+" dni.");
    }
}

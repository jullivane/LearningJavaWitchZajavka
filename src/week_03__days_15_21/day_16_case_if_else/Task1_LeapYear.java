package week_03__days_15_21.day_16_case_if_else;

// Napisz program sprawdzający, czy podany rok jest przestępny i na ekranie wydrukuj TAK lub NIE.
// wg Wikipedii (https://pl.wikipedia.org/wiki/Rok_przest%C4%99pny) latami przestępnymi są te, których numeracja:
//  - jest podzielna przez 4 i niepodzielna przez 100 lub
//  - jest podzielna przez 400
public class Task1_LeapYear {


    private static boolean checkIfLeapYear(int year){
        boolean leapYear = false;
        if ((year%4==0 && year%100!=0) || year%400==0)
            leapYear = true;
        return leapYear;
    }

    public static void main(String[] args) {
        int year = 2000;
        System.out.format("Czy rok %d jest przestępny? %b\n", year, checkIfLeapYear(year));
    }
}

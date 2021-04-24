package week_03__days_15_21;

public class Task4 {
//4. Rafał ma 6 kolorowych mazaków (czerwony, zielony, niebieski, czarny, żółty i brązowy)
//   i rysuje nimi w podanej kolejności kolorów 100 kresek. Jaki kolor będzie miała ostatnia kreska?
//   Napisz program, który to policzy.

    public static void main(String[] args) {
        String[] abc = new String[] {"brązowy", "czerwony", "zielony", "niebieski", "czarny", "żółty"};
        System.out.println(abc[100%6]);
    }
}

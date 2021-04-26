package week_03__days_15_21.day_17_loops;

// Rafał ma 6 kolorowych mazaków (czerwony, zielony, niebieski, czarny, żółty i brązowy)
// i rysuje nimi w podanej kolejności kolorów 100 kresek.
// Wypisz wszystkie kolory w kolejności odpowiadające rysowanym kreskom i zobacz jaki kolor będzie ostatni.
public class Task4_Markers {

    private static void kreski(String[] array, int n) {
        for (int i = 0; i < n; i++)
            System.out.println((i + 1) + ":\t" + array[i % array.length]);
    }

    public static void main(String[] args) {
        kreski(new String[]{"czerwony", "zielony", "niebieski", "czarny", "żółty", "brązowy"}, 100);
    }
}

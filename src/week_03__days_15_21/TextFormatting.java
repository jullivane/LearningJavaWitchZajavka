package week_03__days_15_21;

public class TextFormatting {

    public static void main(String[] args) {
        boolean a = true;
        byte b = 1;
        short c = 2;
        int d = 3;
        long e = 4;
        float f = 5;
        double g = 6.6;
        char h = 'h';
        String i = "iiii";

        System.out.printf("a: %b\nb: %d\nc: %d\nd: %d\ne: %d\nf: %f\ng: %f\n", a, b, c, d, e, f, g);
        // %b - do typu boolean
        // %d - do typu calkowitego: byte, short, int, long,...
        // %f - do typu zmiennoprzecinkowego: float, double
        // %s - do zmiennych tesktowych: char, String
        // \t - znak tabulacji
        // \n - znak nowej linii

        System.out.println("Ala ma "+a+" lat, Piotr ma ");

//        Znacie moze instrukcje System.out.printf()? Mi ona bardzo ulatwia zycie, mozna dzieki temu laczyc teskt i zmienne podczas drukowania na ekran
    }
}

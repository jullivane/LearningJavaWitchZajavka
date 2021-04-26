package week_03__days_15_21.day_17_loops;

// Napisz program, który na ekranie będzie w stanie wydrukować następujący ciąg znaków:
// 39,11,41,8,43,5,45,2,47,-1,49,-4,51,-7,53,-10,55,-13,57,-16.
// Napisz ten program w taki sposób, żebyś był w stanie podać długość drukowanego ciągu,np 1000.
// Zauważ, że na końcu ciągu nie ma przecinka, są tylko w środku ;)

public class Task6_SequenceOfNumbers {

    private static void printing(int n) {
        int a = 37, b = 14;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                System.out.print(a += 2);
            else
                System.out.print(b -= 3);
            if (i < n - 1)
                System.out.print(",");
        }
    }

    // Napisz program, który na ekranie będzie w stanie wydrukować następujący ciąg znaków:
    // 39,11,41,8,43,5,45,2,47,-1,49,-4,51,-7,53,-10,55,-13,57,-16.
    // Napisz ten program w taki sposób, żebyś był w stanie podać długość drukowanego ciągu,np 1000.
    // Zauważ, że na końcu ciągu nie ma przecinka, są tylko w środku ;)
    private static void characterString(String text, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(text.charAt(i % text.length()));
            if (i%text.length()==text.length()-1)
                System.out.print(",");
        }
    }
    public static void main(String[] args) {
        characterString("39,11,41,8,43,5,45,2,47,-1,49,-4,51,-7,53,-10,55,-13,57,-16", 100);
    }

    private static void exercise6() {
        int counter = 0;
        for (int i = 39, j = 11; counter < 10; counter++) {
            if (counter == 9) {
                System.out.print(i + "," + j);
            } else {
                System.out.print(i + "," + j + ",");
            }
            i = i + 2;
            j = j - 3;
        }
    }
}

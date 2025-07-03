import java.io.*;
import java.util.*;

public class Latihan_1 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Masukan Total Angka: ");
            int n = Integer.parseInt(br.readLine());

            int[] nilai = new int[n];
            double rata = 0;

            System.out.println("");
            System.out.println("Masukan " + n + " Angka:");
            for (int i = 0; i < nilai.length; i++) {
                System.out.print("Masukan angka ke-" + (i + 1) + ": ");
                nilai[i] = Integer.parseInt(br.readLine());
                rata += nilai[i];
            }
            int max = getMaxValue(nilai);
            int min = getMinValue(nilai);
            rata /= n;

            System.out.println("");
            System.out.println("Terbesar: " + max);
            System.out.println("Terkecil: " + min);
            System.out.format("Rata-Rata: %.2f", rata);

        } catch (InputMismatchException mantan) {
            System.out.println(mantan);
        }
    }

    private static int getMaxValue(int[] nilai) {
        int maxValue = nilai[0];
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] > maxValue) {
                maxValue = nilai[i];
            }
        }
        return maxValue;
    }

    private static int getMinValue(int[] nilai) {
        int minValue = nilai[0];
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] < minValue) {
                minValue = nilai[i];
            }
        }
        return minValue;
    }
}

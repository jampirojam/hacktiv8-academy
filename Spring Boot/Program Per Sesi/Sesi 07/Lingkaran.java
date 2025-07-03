import java.util.Scanner;

public class Lingkaran {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Masukan nilai Lebar: ");
            int l = in.nextInt();

            System.out.print("Masukan nulai Panjang: ");
            int p = in.nextInt();

            int luas = p * l;
            System.out.format("Luas lingkaran: %d", luas);
        }
    }
}

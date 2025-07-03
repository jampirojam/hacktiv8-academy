import java.util.Scanner;

public class CariBiner {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int c, first, last, mid, n, search;
            int[] array = new int[10];

            System.out.print("Total Elemen: ");
            n = scan.nextInt();

            for (c = 0; c < n; c++) {
                array[c] = scan.nextInt();
            }

            System.out.print("Cari Angka: ");
            search = scan.nextInt();
            first = 0;
            last = n - 1;
            mid = (first + last) / 2;

            while (first <= last) {
                if (array[mid] < search) {
                    first = mid + 1;
                } else if (array[mid] == search) {
                    System.out.println(search + " ditemukan di indeks ke-" + (mid));
                    break;
                } else {
                    last = mid - 1;
                    mid = (first + last) / 2;
                }

                if (first > last) {
                    System.out.println(search + " tidak ada dalam daftar indeks");
                }
            }
        }
    }
}
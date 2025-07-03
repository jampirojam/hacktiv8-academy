import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int x, y;

            System.out.print("Total Data : ");
            int jumlah = scan.nextInt();

            int[] data = new int[jumlah];
            System.out.println();
            for (x = 0; x < jumlah; x++) {
                System.out.print("Data indeks ke-" + (x) + ": ");
                data[x] = scan.nextInt();
            }

            System.out.println();
            System.out.println("Raw Data: ");
            for (x = 0; x < jumlah; x++) {
                System.out.print(data[x] + " ");
            }

            System.out.println("");
            System.out.println("PROSES:");
            for (x = 0; x < jumlah; x++) {
                System.out.print("Sorting ke-" + (x + 1) + ": ");
                for (y = 0; y < jumlah; y++) {
                    System.out.print(data[y] + " ");
                }

                boolean tukar = false;
                int index = 0;
                int min = data[x];

                String pesan = " -> tidak ada pertukaran";

                for (y = (x + 1); y < jumlah; y++) {
                    if (min > data[y]) {
                        tukar = true;
                        index = y;
                        min = data[y];
                    }
                }

                if (tukar == true) {
                    pesan = " -> " + data[x] + " ditukar dengan " + data[index];
                    int temp = data[x];
                    data[x] = data[index];
                    data[index] = temp;
                }
                System.out.println(pesan);
            }

            System.out.print("Data Hasil Sorting: ");
            for (x = 0; x < jumlah; x++) {
                System.out.print(data[x] + " ");
            }
        }
    }
}
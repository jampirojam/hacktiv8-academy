import java.io.*;

public class Latihan_2 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Masukan Baris Bangku: ");
            int bar = Integer.parseInt(br.readLine());

            System.out.print("Masukan Kolom Bangku: ");
            int kol = Integer.parseInt(br.readLine());

            String[][] totalSiswa = new String[kol][bar];

            System.out.println("");
            for (int i = 0; i < kol; i++) {
                for (int j = 0; j < bar; j++) {
                    System.out.print("Masukan nama siswa di baris ke-" + (i + 1) + ", kolom ke " + (j + 1) + ": ");
                    totalSiswa[i][j] = br.readLine();
                }
            }

            System.out.println("");
            System.out.println("==================================================");
            for (int i = 0; i < kol; i++) {
                for (int j = 0; j < bar; j++) {
                    System.out.format("| %-15s | %-5s", totalSiswa[i][j], " ");
                }
                System.out.println("");
            }
            System.out.println("=================================================");

        } catch (IOException mantan) {
            System.out.println(mantan);
        }
    }
}

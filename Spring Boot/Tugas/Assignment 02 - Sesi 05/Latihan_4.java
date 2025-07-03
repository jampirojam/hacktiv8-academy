import java.io.*;

public class Latihan_4 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int Bulan, Tahun;

            System.out.print(" Masukan Bulan (dalam angka): ");
            Bulan = Integer.parseInt(br.readLine());

            System.out.print(" Masukan Tahun : ");
            Tahun = Integer.parseInt(br.readLine());

            System.out.println("==============================================");

            if (Tahun % 400 == 0 || Tahun % 4 == 0) {
                System.out.print("Tahun " + Tahun + " merupakan tahun kabisat, dan di bulan");
            } else {
                System.out.print("Tahun " + Tahun + " bukan merupakan tahun kabisat, dan di bulan");
            }
            if (Bulan == 1)
                System.out.println(" Januari, terdapat 31 hari");
            if (Bulan == 2) {
                if (Tahun % 400 == 0 || Tahun % 4 == 0) {
                    System.out.println(" Februari, terdapat 29 hari ");
                } else if (Tahun % 400 != 0 || Tahun % 4 != 0) {
                    System.out.println(" Februari, terdapat 28 hari ");
                }
            }
            if (Bulan == 3)
                System.out.println(" Maret, terdapat 31 hari");
            if (Bulan == 4)
                System.out.println(" April, terdapat 30 hari");
            if (Bulan == 5)
                System.out.println(" Mei, terdapat 31 hari");
            if (Bulan == 6)
                System.out.println(" Juni, terdapat 30 hari");
            if (Bulan == 7)
                System.out.println(" Juli, terdapat 31 hari");
            if (Bulan == 8)
                System.out.println(" Agustus, terdapat 31 hari");
            if (Bulan == 9)
                System.out.println(" September, terdapat 30 hari");
            if (Bulan == 10)
                System.out.println(" Oktober, terdapat 31 hari");
            if (Bulan == 11)
                System.out.println(" November, terdapat 30 hari");
            if (Bulan == 12)
                System.out.println(" Desember, terdapat 31 hari");

        } catch (IOException mantan) {
            System.out.println(mantan);
        }
    }
}

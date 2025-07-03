import java.io.*;

public class Latihan_3 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            double totalHarga = 0, diskon = 0.1, hargaBayar = 0;
            System.out.print("Total Belanja: ");
            totalHarga = Double.parseDouble(br.readLine());

            if (totalHarga >= 1000000) {
                hargaBayar = totalHarga - (totalHarga * diskon);
            } else {
                hargaBayar = totalHarga;
            }
            System.out.println("Total belanjaan Anda sebesar, Rp" + hargaBayar);

        } catch (IOException mantan) {
            System.out.println(mantan);
        }
    }
}

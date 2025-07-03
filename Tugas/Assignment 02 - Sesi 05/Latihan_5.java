import java.io.*;
import java.text.*;
import java.util.*;

public class Latihan_5 {
    public static void main(String[] args) {
        System.out.println("DAFTAR BARANG ========================");
        System.out.format("%-5s %-25s %-15s %-2s\n", "Kode", "Barang", "Harga", "Diskon");
        System.out.format("%-5s %-25s %-15s %-2s\n", "1.", "Mouse Bluetooth 5.0", "Rp149.999", "10%");
        System.out.format("%-5s %-25s %-15s %-2s\n", "2.", "Headphone Eksternal", "Rp246.000", "5%");
        System.out.format("%-5s %-25s %-15s %-2s\n", "3.", "PowerBank 10.000 mAh", "Rp136.000", "-");
        System.out.format("%-5s %-25s %-15s %-2s\n", "4.", "Tripod Kamera", "Rp267.999", "20%");
        System.out.format("%-5s %-25s %-15s %-2s\n", "5.", "Smartwatch Xiaomi", "Rp899.000", "10%");

        System.out.println("");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double jjb, kode, jumlahBarang, diskon = 0, disk, harga, totalHarga, hargaTotal = 0;
        String nama;
        NumberFormat rp = NumberFormat.getCurrencyInstance(new Locale("en", "ID"));

        try {
            System.out.println("");
            System.out.print("Masukan Jumlah Jenis Barang: ");
            jjb = Double.parseDouble(br.readLine());

            int p = (int) jjb;

            String[] namaBarang = new String[p];
            String[] hargaBarang = new String[p];
            int[] kuantitas = new int[p];
            int[] diskonBarang = new int[p];
            String[] totalHargaBarang = new String[p];

            for (int i = 0; i < jjb; i++) {
                System.out.print("Masukan Kode Barang: ");
                kode = Double.parseDouble(br.readLine());

                System.out.print("Masukan Jumlah Barang: ");
                jumlahBarang = Double.parseDouble(br.readLine());
                int jb = (int) jumlahBarang;

                if (kode == 1) {
                    nama = "Mouse Bluetooth 5.0";
                    harga = 149999;
                    disk = 10;
                    totalHarga = (harga * jumlahBarang);
                    diskon = totalHarga - ((totalHarga * disk) / 100);
                } else if (kode == 2) {
                    nama = "Headphone Eksternal";
                    harga = 246000;
                    disk = 5;
                    totalHarga = (harga * jumlahBarang);
                    diskon = totalHarga - ((totalHarga * disk) / 100);
                } else if (kode == 3) {
                    nama = "PowerBank 10.000 mAh";
                    harga = 136000;
                    disk = 0;
                    totalHarga = (harga * jumlahBarang);
                    diskon = totalHarga;
                } else if (kode == 4) {
                    nama = "Tripod Kamera";
                    harga = 267999;
                    disk = 20;
                    totalHarga = (harga * jumlahBarang);
                    diskon = totalHarga - ((totalHarga * disk) / 100);
                } else if (kode == 5) {
                    nama = "Smartwatch Xiaomi";
                    harga = 899000;
                    disk = 10;
                    totalHarga = (harga * jumlahBarang);
                    diskon = totalHarga - ((totalHarga * disk) / 100);
                } else {
                    break;
                }
                namaBarang[i] = nama;
                hargaBarang[i] = String.valueOf(rp.format(harga));
                kuantitas[i] = jb;
                diskonBarang[i] = (int) disk;
                totalHargaBarang[i] = String.valueOf(rp.format(diskon));

                hargaTotal += diskon;
            }

            System.out.println("");
            System.out.println("");
            System.out.println("INVOICE OJAMSTORE");
            System.out.println("============");
            System.out.format("%-5s | %-25s | %-15s | %-5s | %-8s | %-2s\n", "No", "Barang", "Harga", "QTY", "Diskon",
                    "Total");
            System.out.format("%-5s | %-25s | %-15s | %-5s | %-8s | %-2s\n", "--", "------", "-----", "---", "------",
                    "-----");
            for (int i = 0; i < jjb; i++) {
                System.out.format("%-5d | %-25s | %-15s | %-5d | %-8s | %-2s\n", (i + 1), namaBarang[i],
                        hargaBarang[i], kuantitas[i], diskonBarang[i] + "%", totalHargaBarang[i]);
            }
            System.out.println("============");
            System.out.println("Total bayar: " + rp.format(hargaTotal));

        } catch (IOException mantan) {
            System.out.println(mantan);
        }
    }
}

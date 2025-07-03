import java.util.*;

public class Main {
    public static void main(String[] args) {
        BangunDatar bd = new BangunDatar();
        Segitiga wajik = new Segitiga();
        Lingkaran bulet = new Lingkaran();
        PersegiPanjang pp = new PersegiPanjang();
        Persegi kotak = new Persegi();

        bd.luas();
        bd.keliling();

        try (Scanner in = new Scanner(System.in)) {
            System.out.print("1. Lingkaran\n2. Segitiga\n3. Persegi\n4. Persegi Panjang\nPilih: ");
            int menu = in.nextInt();
            if (menu == 1) {
                System.out.print("Nilai Jari-Jari: ");
                bulet.r = in.nextInt();

                bulet.luas();
                bulet.keliling();
            } else if (menu == 2) {
                System.out.print("Nilai Alas: ");
                wajik.a = in.nextInt();

                System.out.print("Nilai Tinggi: ");
                wajik.t = in.nextInt();

                wajik.luas();
                wajik.keliling();
            } else if (menu == 3) {
                System.out.print("Nilai Sisi: ");
                kotak.s = in.nextInt();

                kotak.luas();
                kotak.keliling();
            } else if (menu == 4) {
                System.out.print("Nilai Lebar: ");
                pp.l = in.nextInt();

                System.out.print("Nilai Panjang: ");
                pp.p = in.nextInt();

                pp.luas();
                pp.keliling();
            } else {

            }
        }
    }
}

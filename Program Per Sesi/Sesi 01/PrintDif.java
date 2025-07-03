public class PrintDif {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int x = 12, y = 8, tambah, kurang, kali, bagi;
        tambah = x + y;
        kurang = x - y;
        kali = x * y;
        bagi = x / y;
        System.out.format(
                "Nilai X = %d\nNilai Y = %d\nHasil Tambah: %d\nHasil Kurang: %d\nHasil Kali: %d\nHasil Bagi: %d\n", x,
                y, tambah, kurang, kali, bagi);
        if (tambah >= 0 && kurang >= 0 && kali >= 0 && bagi >= 0) {
            System.out.println("Semua bilangan bernilai positif");
        } else {
            System.out.println("Ada bilangan yang bernilai negatif");
        }
    }
}

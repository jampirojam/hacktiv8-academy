package TreePack;

public class MainClass {

    MainClass left, right;
    int value;

    public void input(int a) {
        value = a;
    }

    public static void main(String[] args) {
        MenuClass mnc = new MenuClass();
        MainClass mic = new MainClass();
        int menu = 1, r = 1, a;
        while (menu != 3) {
            System.out.print("1. Masukan\n2. Lihat\n3. Keluar\nPilih: ");
            menu = MenuClass.inp.nextInt();
            if (menu == 1) {
                System.out.print("Masukan Angka: ");
                a = MenuClass.inp.nextInt();
                if (r == 1) {
                    mic.input(a);
                    r--;
                } else
                    mnc.Masukan(mic, a);
            } else if (menu == 2)
                mnc.Lihat(mic);
            else if (menu == 3) {
                System.out.println("Keluar");
                System.exit(0);
            } else
                System.out.println("Salah");
            System.out.println("");
        }
    }
}

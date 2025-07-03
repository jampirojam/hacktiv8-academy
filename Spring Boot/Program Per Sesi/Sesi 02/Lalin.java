import java.io.*;

public class Lalin {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int pil;

            System.out.println("WARNA LALIN");
            System.out.println("1. Merah");
            System.out.println("2. Kuning");
            System.out.println("3. Hijau");
            System.out.print("Pilih angka: ");
            pil = Integer.parseInt(br.readLine());

            switch (pil) {
                case 1:
                    System.out.println("STOP");
                    break;
                case 2:
                    System.out.println("READY");
                    break;
                case 3:
                    System.out.println("GO!");
                    break;
                default:
                    System.out.println("WHAT?????");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

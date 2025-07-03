import java.io.*;

public class Latihan_1 {
    public static void main(String[] args) {
        double luas, phi;
        int r;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Masukan jari-jari lingkaran: ");
            r = Integer.parseInt(br.readLine());

            if (r % 7 == 0) {
                phi = 22 / 7;
                luas = phi * r * r;
            } else {
                phi = 3.14;
                luas = phi * r * r;
            }
            System.out.format("Luas lingkarannya adalah: %,.2f", luas);

        } catch (IOException mantan) {
            System.out.println(mantan);
        }
    }
}

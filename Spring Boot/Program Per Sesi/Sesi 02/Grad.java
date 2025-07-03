import java.io.*;

public class Grad {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int nilai;
            String nama;

            System.out.print("Nama : ");
            nama = br.readLine();

            System.out.print("Nilai: ");
            nilai = Integer.parseInt(br.readLine());

            if (nilai >= 70) {
                System.out.format("Hei %s, awakmu pinter yo!", nama);
            } else {
                System.out.format("Sepurane yo %s, awakmu gak lulus", nama);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

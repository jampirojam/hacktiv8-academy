import java.io.*;

public class Grade {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int angka = 0;
            String huruf = " ";

            System.out.print("Masukan Nilai: ");
            angka = Integer.parseInt(br.readLine());

            if (angka >= 90) {
                huruf = "A";
            } else if (angka >= 75) {
                huruf = "B";
            } else if (angka >= 60) {
                huruf = "C";
            } else if (angka >= 45) {
                huruf = "D";
            } else if (angka >= 30) {
                huruf = "E";
            } else if (angka >= 15) {
                huruf = "F";
            } else {
                huruf = " ";
            }

            System.out.format("Dengan nilai angka %d, maka anda mendapatkan nilai huruf %s", angka, huruf);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

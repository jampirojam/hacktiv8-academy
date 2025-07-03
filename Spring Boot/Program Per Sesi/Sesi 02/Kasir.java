import java.io.*;

public class Kasir {
    public static void main(String[] args) {
        int tot, diskon;
        String member;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {

            System.out.print("Ada kartu member?: (y/n)");
            member = br.readLine();
            System.out.print("Total Harga: ");
            tot = Integer.parseInt(br.readLine());

            if (member.equalsIgnoreCase("y")) {
                if (tot > 500000) {
                    diskon = 50000;
                } else if (tot > 100000) {
                    diskon = 15000;
                } else {
                    diskon = 0;
                }
            } else {
                if (tot > 100000) {
                    diskon = 5000;
                } else {
                    diskon = 0;
                }
            }
            System.out.format("Total Bayar : Rp%d ", tot - diskon);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

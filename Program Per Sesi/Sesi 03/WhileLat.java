import java.io.*;

public class WhileLat {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            boolean run = true;
            int i = 0;
            String inp;

            while (run) {
                System.out.print("Yakin ingin keluar? (y/n): ");

                inp = br.readLine();

                if (inp.equalsIgnoreCase("y")) {
                    run = false;
                }
                i++;
            }
            System.out.format("Perulangan dilakukan sebanyak %d", i);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

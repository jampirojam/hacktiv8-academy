import java.io.*;

public class Reward {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int b = 0;

            System.out.print("Total belanja: Rp");
            b = Integer.parseInt(br.readLine());

            if (b > 10000) {
                System.out.println("Congrats");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

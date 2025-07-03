import java.io.*;

public class ArrayForeach {
    public static void main(String[] args) {
        String[] ar = new String[5];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            for (int i = 0; i < ar.length; i++) {
                System.out.format("Input data ke %d adalah: ", i);
                ar[i] = br.readLine();
            }

            System.out.println("Hasilnya");

            for (String dt : ar) {
                System.out.println(dt);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

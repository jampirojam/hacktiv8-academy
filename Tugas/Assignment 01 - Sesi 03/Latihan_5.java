import java.io.*;

public class Latihan_5 {
    public static void main(String[] args) {
        int X1, X2, y1, y2;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Masukan nilai y1: ");
            y1 = Integer.parseInt(br.readLine());

            System.out.print("Masukan nilai y2: ");
            y2 = Integer.parseInt(br.readLine());

            System.out.println("Nilai X1 = ( y1 + y2 ) * ( y1 + y2 )");
            System.out.format("Nilai X1 = ( %d + %d ) * ( %d + %d )\n", y1, y2, y1, y2);
            System.out.format("Nilai X1 = %d\n", X1 = (y1 + y2) * (y1 + y2));

            System.out.println("Nilai X2 = ( y1 % 4 ) * y2");
            System.out.format("Nilai X2 = ( %d + 4 ) * %d\n", y1, y2);
            System.out.format("Nilai X2 = %d\n", X2 = (y1 % 4) * y2);

            // Soal Lanjutan
            if (X1 == X2)
                System.out.println(true);
            if (X2 == X1)
                System.out.println(false);
            if ((X1 % 4) == (X2 % 5))
                System.out.println(true);

        } catch (IOException mantan) {
            System.out.println(mantan);
        }
    }
}

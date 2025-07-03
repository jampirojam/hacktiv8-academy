import java.io.*;
import java.util.*;

class Session01AllLesson {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int jk;
        double tot = 0, rata = 0;
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        try {
            System.out.print("Masukan jumlah kandidat: ");
            jk = Integer.parseInt(br.readLine());

            int[] jumlah = new int[jk];
            String[] nama = new String[jk];
            int[] umur = new int[jk];

            for (int i = 0; i < jumlah.length; i++) {
                System.out.print("Nama: ");
                nama[i] = br.readLine();

                System.out.print("Umur: ");
                umur[i] = Integer.parseInt(br.readLine());

                hm.put(nama[i], umur[i]);
            }

            System.out.println("Data kandidat dan umurnya: " + hm);

            List<String> namakan = new LinkedList<>(hm.keySet());
            List<Integer> umurkan = new LinkedList<>(hm.values());

            System.out.println("Data nama kandidat: " + namakan);
            System.out.println("Data umur kandidat: " + umurkan);

            for (int i = 0; i < umurkan.size(); i++) {
                tot += umurkan.get(i);
                rata = tot / umurkan.size();
            }

            System.out.format("Total umur kandidat adalah %,.2f tahun, sedang rata-rata umurnya adalah %,.2f tahun",
                    tot, rata);
        } catch (IOException mantan) {
            System.out.println(mantan);
        }
    }
}

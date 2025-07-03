public class EachLat {
    public static void main(String[] args) {
        int angka[] = { 3, 1, 42, 24, 12 };

        System.out.print("Angkanya: ");
        for (int x : angka) {
            System.out.print(x + " ");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("BREAK");

        int i;
        for (i = 0; i < 4; i++) {
            if (i >= 3) {
                break;
            }
            System.out.println("Master");
        }
        System.out.println(i);

        System.out.println("");
        System.out.println("CONTINUE");

        int q;
        for (q = 0; i < 4; q++) {
            if (q >= 3) {
                break;
            }
            System.out.println("Master");
            if (q >= 2) {
                continue;
            }
            System.out.println("Java");
        }
        System.out.println(q);
    }
}

public class Biner {

    public static int cariBiner(int[] list, int key) {
        int bawah = 0, atas = list.length - 1;

        while (atas >= bawah) {
            int tengah = (bawah + atas) / 2;

            if (key < list[tengah])
                atas = tengah - 1;
            else if (key == list[tengah])
                return tengah;
            else
                bawah = tengah + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int myArray[] = { 5, 8, 12, 15, 17, 23, 26, 30, 34, 38, 42, 54, 64, 78, 81 };
        int key1 = 26, key2 = 78, key3 = 8, key4 = 39;

        int i = Biner.cariBiner(myArray, key1);
        int j = Biner.cariBiner(myArray, key2);
        int k = Biner.cariBiner(myArray, key3);
        int l = Biner.cariBiner(myArray, key4);

        System.out.println("Key " + key1 + " index " + i);
        System.out.println("Key " + key2 + " index " + j);
        System.out.println("Key " + key3 + " index " + k);
        System.out.println("Key " + key4 + " index " + l);
    }
}
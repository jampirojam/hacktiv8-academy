public class Latihan_3 {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 9, d = 9;

        for (int i = 1; i <= 4; i++) {
            System.out.println("Print ke-" + i);
            System.out.println("A: " + a++);
            System.out.println("B: " + ++b);
            System.out.println("C: " + c--);
            System.out.println("C: " + --d);
        }
    }
}

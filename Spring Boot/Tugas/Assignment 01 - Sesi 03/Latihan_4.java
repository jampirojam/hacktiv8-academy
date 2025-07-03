public class Latihan_4 {
    public static void main(String[] args) {
        int a = 10, b = 8, c = 12, d = 5;

        System.out.println("Tes ke-1: " + (a > b && b > d && c > a));
        System.out.println("Tes ke-2: " + (a < c && d < b && b < a));
        System.out.println("Tes ke-3: " + (a >= b && b >= d && c >= a));
        System.out.println("Tes ke-4: " + (a <= c && d <= b && b <= a));
        System.out.println("Tes ke-5: " + ((a / d) == (a - b)));
        System.out.println("Tes ke-6: " + (a != b && b != c && c != d && d != a));
        System.out.println("Tes ke-7: " + (a > c && d > b && b > a));
        System.out.println("Tes ke-8: " + (a <= b && b <= d && c <= a));
        System.out.println("Tes ke-9: " + (a == b && b == c && c == d && d == a));
        System.out.println("Tes ke-5: " + ((a / d) != (a - b)));
    }
}

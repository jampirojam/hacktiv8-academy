public class MaxNumber {
    public static void main(String[] args) {
        System.out.println(maxNumb(10, 20));
        System.out.println(maxNumb(4.5, 7.5));
    }

    public static double maxNumb(double a, double b) {
        return (a > b) ? a : b;
    }

    public static int maxNumb(int a, int b) {
        return (a > b) ? a : b;
    }
}

public class Numb {
    int num1, num2;

    void cetakNilai(String str) {
        System.out.println("(" + num1 + ", " + num2 + ")");
    }

    Numb center(Numb other) {
        return new Numb((num1 + other.num1) / 2, (num2 + other.num2) / 2);
    }

    Numb() {
        this(0, 0);
    }

    Numb(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public static void main(String[] args) {
        Numb n = new Numb(10, 10);
        n.cetakNilai("Cetak Nilai");
        n.center(new Numb(7, 5)).cetakNilai("Nilai");
    }
}
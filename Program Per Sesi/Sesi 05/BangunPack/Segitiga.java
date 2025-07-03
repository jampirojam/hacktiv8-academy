public class Segitiga extends BangunDatar {
    float a, t;

    @Override
    float luas() {
        float luas = a * t / 2;
        System.out.format("Luas Segitiga: %.2f\n", luas);
        return luas;
    }

    float keliling() {
        float keliling = a * 3;
        System.out.format("Keliling Segitiga: %.2f\n", keliling);
        return keliling;
    }
}
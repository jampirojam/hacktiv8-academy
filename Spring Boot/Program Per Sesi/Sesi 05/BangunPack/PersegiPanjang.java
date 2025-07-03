public class PersegiPanjang extends BangunDatar {
    float p, l;

    @Override
    float luas() {
        float luas = p * l;
        System.out.format("Luas Persegi Panjang: %.2f\n", luas);
        return luas;
    }

    @Override
    float keliling() {
        float keliling = 2 * p + 2 * l;
        System.out.format("Keliling Persegi Panjang: %.2f\n", keliling);
        return keliling;
    }
}
public class Persegi extends BangunDatar {
    float s;

    @Override
    float luas() {
        float luas = s * s;
        System.out.format("Luas Persegi: %.2f\n", luas);
        return luas;
    }

    @Override
    float keliling() {
        float keliling = 4 * s;
        System.out.format("Keliling Persegi: %.2f\n", keliling);
        return keliling;
    }
}

public class Lingkaran extends BangunDatar {
    float r;

    @Override
    float luas() {
        float luas = (float) (Math.PI * r * r);
        System.out.format("Luas lingkaran: %.2f\n", luas);
        return luas;
    }

    @Override
    float keliling() {
        float keliling = (float) (2 * Math.PI * r);
        System.out.format("Keliling Lingkaran:  %.2f\n", keliling);
        return keliling;
    }
}
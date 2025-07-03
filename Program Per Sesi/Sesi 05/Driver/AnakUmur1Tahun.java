package Driver;

class AnakUmur1Tahun extends Induk {

    public void namaAyahKu() {
        System.out.println("Nama Ayahku adalah " + namaAyah);
    }

    @Override
    public void mobil() {
        System.out.println("Anak umur 1 tahun tidak boleh menyetir mobil");
    }

    @Override
    public void motor() {
        System.out.println("Anak umur 1 tahun tidak boleh menyetir mobil");
    }
}
package Resto;

public class Makanan {
    public static void main(String[] args) {
        Restoran data = new Restoran();

        data.setMenu("Ayam Kampung");
        data.setHarga(5000000);
        data.setSpecial(true);

        System.out.println("Menu Makanan: " + data.getMenu());
        System.out.println("Harga Makanan: " + data.getHarga());
        System.out.println("Menu Special: " + data.getSpecial(true));
    }
}

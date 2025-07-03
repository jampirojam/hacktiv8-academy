import java.util.LinkedList;

public class TambahLucintaList {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Jeruk");
        ll.add("Pepaya");
        ll.add("Terong");
        ll.add("Mangga");
        ll.add("Apel");
        ll.add("Nanas");
        ll.add("Sirsak");
        ll.add("Durian");
        System.out.println("Daftar buah kesukaan Lucinta: " + ll);

        ll.addFirst("Ceri");
        ll.addLast("Belimbing");
        System.out.println("Daftar buah kesukaan Lucinta: " + ll);
    }
}

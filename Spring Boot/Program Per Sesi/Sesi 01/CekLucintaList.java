import java.util.LinkedList;

public class CekLucintaList {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        String hasil = "";
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

        ll.set(2, "Manggis");
        ll.set(4, "Kudu");
        System.out.println("Daftar buah kesukaan Lucinta: " + ll);

        ll.remove(3);
        ll.removeFirst();
        ll.removeLast();
        System.out.println("Daftar buah kesukaan Lucinta: " + ll);

        ll.removeAll(ll);
        System.out.println("Daftar buah kesukaan Lucinta: " + ll);

        if (ll.isEmpty())
            hasil = "Lucinta sudah tidak suka buah";
        else
            hasil = "Lucinta masih suka buah";
        System.out.print(hasil);
    }
}

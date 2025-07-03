public class Human {
    public static void main(String[] args) {
        Manusia cowok = new Cowok();
        cowok.singSong();

        Manusia cewek = new Cewek();
        cewek.singSong();
    }
}

abstract class Manusia {
    protected abstract void singSong();
}

class Cowok extends Manusia {
    @Override
    protected void singSong() {
        System.out.println("Cowok nyanyi: Halo, it's me.");
    }
}

class Cewek extends Manusia {
    @Override
    protected void singSong() {
        System.out.println("Cewek nyanyi: But, I don't like you");
    }
}
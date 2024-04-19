package mx.utng.ss19;

public class Gobierno {
    private static Gobierno gobierno;

    private Gobierno () {

    }

    public static Gobierno getGobierno() {
        if (gobierno==null) {
            gobierno = new Gobierno();
        }
        return gobierno;
    }

    public void darApoyo(){
        System.out.println("Dar Apoyo");
    }
}

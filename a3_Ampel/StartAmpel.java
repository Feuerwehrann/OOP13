public class StartAmpel {
    public static void main(String[] args) {
        System.out.println("Ampeln gestartet");
        Ampel ampel1 = new Ampel("Ampel 1", 300);
        Ampel ampel2 = new Ampel("Ampel 2", 500);

        ampel1.start();
        ampel2.start();

    }

}
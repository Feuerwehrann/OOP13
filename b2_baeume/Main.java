package b2_baeume;

public class Main {
    public static void main(String[] args) {
        Baum meinBaum = new Baum();
        meinBaum.insert(9);
        meinBaum.insert(10);
        meinBaum.insert(17);
        meinBaum.insert(5);
        meinBaum.insert(2);
        meinBaum.insert(1);
        meinBaum.insert(8);
        System.out.println("\33[H\033[2J");
        System.out.flush();
        System.out.println(meinBaum.anzahl());
        System.out.println(meinBaum.hoehe());
    }

}

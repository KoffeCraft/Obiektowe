public class Uczen extends Osoba{
    private static int liczbaUczniow = 0;
    private int nrUcznia;

    public Uczen(String imie, String nazwisko) {
        super(imie, nazwisko);
        liczbaUczniow++;
        nrUcznia = liczbaUczniow;
    }

    public static int getLiczbaUczniow() {
        return liczbaUczniow;
    }

    public static void setLiczbaUczniow(int liczbaUczniow) {
        Uczen.liczbaUczniow = liczbaUczniow;
    }

    public int getNrUcznia() {
        return nrUcznia;
    }

    public void setNrUcznia(int nrUcznia) {
        this.nrUcznia = nrUcznia;
    }

    @Override
    public String toString() {
        return "Uczen{ imie=" + getImie() + " nazwisko=" + getNazwisko() +
                " nrUcznia=" + nrUcznia +
                '}';
    }
}

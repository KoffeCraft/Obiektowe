public class Nauczyciel extends Osoba{
    private String przedmiot;

    public Nauczyciel(String imie, String nazwisko, String przedmiot) {
        super(imie, nazwisko);
        this.przedmiot = przedmiot;
    }

    @Override
    public String toString() {
        return "Nauczyciel{ imie=" + getImie() + " nazwisko=" + getNazwisko() +
                " przedmiot='" + przedmiot + '\'' +
                '}';
    }
}

import java.util.ArrayList;

public class Klasa {
    private ArrayList<Uczen> uczniowie;
    private Nauczyciel wychowawca;

    public Klasa(Nauczyciel wychowawca) {
        this.wychowawca = wychowawca;
    }
    private void dodajUczniaDoKlasy(Uczen uczen){
        if(uczniowie.contains(uczen))
            return;
        uczniowie.add(uczen);
    }

    @Override
    public String toString() {
        String listaUczniow = "";
        for(Uczen uczen:uczniowie){
            listaUczniow += uczen + "\n";
        }
        return "Klasa{" +
                "wychowawca=" + wychowawca +
                '}';
    }
}

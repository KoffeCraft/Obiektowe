//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //System.out.printf("Hello and welcome!");

        Uczen uczen = new Uczen("Edek","Fredek");
        System.out.println("Liczba uczniów: " + Uczen.getLiczbaUczniow());
        System.out.println(uczen);
        Uczen uczen2 = new Uczen("Ela","Mela");
        System.out.println("Liczba uczniów: " + Uczen.getLiczbaUczniow());
        System.out.println(uczen2);
        Uczen uczen3 = new Uczen("Ala","Fala");
        System.out.println("Liczba uczniów: " + Uczen.getLiczbaUczniow());
        System.out.println(uczen3);
    }
}
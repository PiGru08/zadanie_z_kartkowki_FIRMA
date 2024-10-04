//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Kierwonik kierwonik = new Kierwonik("Adam", "Nawałka", 10000, "Master");
        Pracownik pracownikAla = new Pracownik("Alicja", "Dobroduszna", 6000, "Sekretarka");
        Pracownik pracownikPiotr = new Pracownik("Piotr", "Dobroddziej", 19500, "Kursant");
        Pracownik pracownikOlaf = new Pracownik("Olaf", "Kałkazy", 7600, "Magazynier");

        Firma firma = new Firma();
        firma.dodajPracownika(pracownikAla);
        firma.dodajPracownika(pracownikPiotr);
        firma.dodajPracownika(pracownikOlaf);
        System.out.println(firma.obliczKosztWypłaty());
        System.out.println(pracownikAla);
        pracownikAla.setPodwyzka(30);
        kierwonik.dajPodwyzke(50);
        System.out.println(pracownikAla);
        System.out.println(firma.obliczKosztWypłaty());
    }
}

import java.util.ArrayList;

public class Kierwonik extends Pracownik {
    private ArrayList<Pracownik> pracownicy =    new ArrayList<>();

    public Kierwonik(String imie, String nazwisko, double wyplata, String stanowisko) {
        super(imie, nazwisko, wyplata, stanowisko);
        this.pracownicy = pracownicy;
    }
    public void dodajPracownika (Pracownik pracownik) {
        pracownicy.add(pracownik);
    }
    public void dajPodwyzke(int procent){
        setWyplata(getWyplata()*(1+procent/100));
        for (int i = 0; i < pracownicy.size(); i++) {
            System.out.println(pracownicy.get(i));
            pracownicy.get(i).setPodwyzka(procent);
            System.out.println(pracownicy.get(i));
        }
    }
}
package nauka.exercise.HumanENUMTest;

public class Human {

    private String imie;
    private int wiek;
    private EyeColour kolorOczu;
    private HairColour kolorWlosow;


    public Human(String imie, int wiek, EyeColour kolorOczu, HairColour kolorWlosow) {
        this.imie = imie;
        this.wiek = wiek;
        this.kolorOczu = kolorOczu;
        this.kolorWlosow = kolorWlosow;
    }

    public String getImie() {
        return imie;
    }

    public int getWiek() {
        return wiek;
    }

    public EyeColour getKolorOczu() {
        return kolorOczu;
    }

    public HairColour getKolorWlosow() {
        return kolorWlosow;
    }

    public static void main(String[] args) {
        Human franek = new Human("Franek", 33, EyeColour.GRAY, HairColour.BROWN);
        System.out.println(franek.getKolorOczu());
        System.out.println(franek.getKolorWlosow());
    }
}

package nauka.exercise.HumanENUMTest;

public class Human {

    private String imię;
    private int wiek;
    private EyeColour kolorOczu;
    private HairColour kolorWlosow;


    public Human(String imię, int wiek, EyeColour kolorOczu, HairColour kolorWlosow) {
        this.imię = imię;
        this.wiek = wiek;
        this.kolorOczu = kolorOczu;
        this.kolorWlosow = kolorWlosow;
    }

    public String getImię() {
        return imię;
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

package nauka.Podstawy;


class HumanCompare {

    private String imie;
    private String nazwisko;
    private int wiek;
    private String pesel;

    public HumanCompare(String imie, String nazwisko, int wiek, String pesel){
    this.imie = imie;
    this.nazwisko = nazwisko;
    if (wiek < 0) throw new IllegalArgumentException("Wiek musi być większy od zera!");
    this.wiek = wiek;
    if (pesel == null) throw new IllegalArgumentException("Każdy człowiek musi mieć pesel!");
    this.pesel = pesel;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public String getPesel() {
        return pesel;
    }

    @Override
    public String toString() {
        return imie + " " + nazwisko + " " + wiek + " " + pesel;
    }

    @Override
    public int hashCode() {
        return 17 * pesel.hashCode() * wiek;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof HumanCompare)) {
            return false;
        }
        HumanCompare otherHumanCompare = (HumanCompare) obj;
        if (this.wiek != otherHumanCompare.getWiek()){
            return false;
        }
        return pesel.equals(otherHumanCompare.getPesel());
    }


    public static void main(String[] args) {
        HumanCompare humanCompare1 = new HumanCompare("Jan", "Kowalski",50, "850223000000");
        HumanCompare humanCompare2 = new HumanCompare("Jan", "Kowalski",30,  "891213000000");
        HumanCompare humanCompare3 = new HumanCompare("Jan", "Kowalski",12,  "850223000000");

        System.out.println(humanCompare1 + " == " + humanCompare2 + " " + humanCompare1.equals(humanCompare2));
        System.out.println(humanCompare2 + " == " + humanCompare3 + " " + humanCompare2.equals(humanCompare3));
        System.out.println(humanCompare1 + " == " + humanCompare3 + " " + humanCompare1.equals(humanCompare3));
    }
}
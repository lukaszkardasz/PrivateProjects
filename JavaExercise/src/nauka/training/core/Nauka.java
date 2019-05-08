package nauka.training.core;

class Nauka {

    public static void main(String[] args) {
        Osoba[] osoba = new Osoba[4];
        osoba[0] = new Pracownik("Franek", "Kimono", 15.0);
        osoba[1] = new Student("Zenek", "Gryzipiorko");
        osoba[1] = new Pracownik("Grzechu", "Papryka", 12.0);
        osoba[1] = new Student("Ziutek", "Babuch");
        for (Osoba person : osoba){
            if (person instanceof Pracownik){
                person.pobierzOpis();

            }
        }
    }
}

abstract class Osoba{
    String imie;
    String nazwisko;

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public abstract void pobierzOpis();
}

class Pracownik extends Osoba{

    double wynagrodzenie;

    Pracownik(String imie, String nazwisko, double wynagrodzenie){
        super(imie, nazwisko);
        this.wynagrodzenie = wynagrodzenie;
    }

    @Override
    public void pobierzOpis() {
            System.out.println("Jestem pracownikiem");
            System.out.println("Imię:" + imie);
            System.out.println("Nazwisko:" + nazwisko);
            System.out.println("Wynagrodzenie:" + wynagrodzenie);
    }

    void pracuj(){
        System.out.println("Ja pracuje!");
    }
}

class Student extends Osoba{

    public Student(String imie, String nazwisko) {
        super(imie, nazwisko);
    }

    @Override
    public void pobierzOpis() {
        System.out.println("Jestem studentem");
        System.out.println("Imię:" + imie);
        System.out.println("Nazwisko:" + nazwisko);
    }
}

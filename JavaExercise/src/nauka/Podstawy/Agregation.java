package nauka.Podstawy;



public class Agregation {

    public static void main(String[] args) {

        Human2 p = new Human2("Lukasz", new Adress("Krucza", 45));
        System.out.println(p);
    }

}

class Human2{
    String name;
    Adress adress;

    public Human2(String name, Adress adress) {
        this.name = name;
        this.adress = adress;
    }

    @Override
    public String toString() {
        return this.name + ": " + adress.uliuca + " " + adress.nrDomu;
    }
}

class Adress{
    String uliuca;
    int nrDomu;

    public Adress(String uliuca, int nrDomu) {
        this.uliuca = uliuca;
        this.nrDomu = nrDomu;
    }
}


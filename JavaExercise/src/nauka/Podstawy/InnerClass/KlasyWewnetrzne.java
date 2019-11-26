package nauka.Podstawy.InnerClass;


public class KlasyWewnetrzne {

    public static void main(String[] args) {

        BankAccount kontoBankowe = new BankAccount(1000);
        System.out.println(kontoBankowe.getStanKonta());
        kontoBankowe.start(5);
        System.out.println(kontoBankowe.getStanKonta());
    }

}

class BankAccount {


    private double stanKonta;

    public BankAccount(int stanKonta) {
        this.stanKonta = stanKonta;
    }

    public double getStanKonta() {
        return this.stanKonta;
    }

    void start(double stopa) {
        Odsetki odsetki = new Odsetki(stopa);

    }


    class Odsetki {
        private double stopaProcentowa;

        public Odsetki(double stopaProcentowa) {
            this.stopaProcentowa = stopaProcentowa;
            this.zmienStanKonta(stopaProcentowa);
        }

        void zmienStanKonta(double stopa) {
            double odsetki = (stanKonta * stopa) / 100;
            stanKonta += odsetki;
        }

    }


}

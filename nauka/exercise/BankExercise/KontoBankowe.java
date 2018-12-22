package nauka.exercise.BankExercise;

public class KontoBankowe implements Konto {

    int stanKonta;

    KontoBankowe() {
        this(0);
    }

    public KontoBankowe(int stanKonta) {
        this.stanKonta = stanKonta;
    }

    @Override
    public void wplata(int kwota) {
        if (kwota <= 0){
            throw new IllegalArgumentException("kwota musi być większa od zera!");
        }
        stanKonta += kwota;
    }

    @Override
    public void wyplata(int kwota) {
        if (kwota <= 0){
            throw new IllegalArgumentException("kwota musi być większa od zera!");
        }
        stanKonta -= kwota;
    }

    public int getStanKonta() {
        return stanKonta;
    }
}

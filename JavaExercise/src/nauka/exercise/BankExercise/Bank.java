package nauka.exercise.BankExercise;

public class Bank implements BankTransfer {

    public final int OPLATA_TRANSFEROWA = 1;

    @Override
    public void transfer(KontoBankowe from, KontoBankowe to, int kwota) {
        if (from.stanKonta < OPLATA_TRANSFEROWA + kwota){
            throw new IllegalStateException("Niewystarczająca ilość środków!");
        }
        from.wyplata(kwota + OPLATA_TRANSFEROWA);
        to.wplata(kwota);
    }



    public static void main(String[] args) {
        
        Bank CreditAgricole = new Bank();
        Bank mBank = new Bank();

        KontoBankowe konto1 = new KontoBankowe();
        KontoBankowe konto2 = new KontoBankowe();

        konto1.wplata(100);
        konto2.wplata(80);
        konto2.wyplata(70);


        CreditAgricole.transfer(konto1, konto2, 40);
        mBank.transfer(konto1, konto2, 30);

        System.out.println(konto1.getStanKonta());
        System.out.println(konto2.getStanKonta());

    }
}


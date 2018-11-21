package nauka.Enums;

public class EnumsExercise {


    public enum DniTygodnia {

        PONIEDZIALEK (1, "pon"),
        WTOREK(2, "wt"),
        SRODA(3, "sr"),
        CZWARTEK(4, "czw"),
        PIATEK(5, "pt"),
        SOBOTA(6, "sob"),
        NIEDZIELA(7, "nd");
        private int numer;
        private String skrot;

        DniTygodnia(int numer, String skrot) {
            this.numer = numer;
            this.skrot = skrot;
        }

        @Override
        public String toString() {
            return "Dzien Tygodnia " + super.toString() +
                    " numer: " + numer +
                    ", skrot= '" + skrot + '\'';
        }

        public void komentuj(){
            if (this == DniTygodnia.PIATEK){
                System.out.println("Lubie piateczek!");
            } else if (this == DniTygodnia.PONIEDZIALEK)
                System.out.println("Nie ciepie poniedzialkow...");;
        }
    }

    public static void main(String[] args) {
        DniTygodnia dzisiaj = DniTygodnia.PIATEK;
        DniTygodnia popo = DniTygodnia.PONIEDZIALEK;

        popo.komentuj();
        dzisiaj.komentuj(); //jak widac nie dziala :)
        //zamiana łańcucha tekstowego na typ enum za pomoca valueOf
        DniTygodnia wtorek = DniTygodnia.valueOf("WTOREK");

        //a odwrotnie values:
        for (DniTygodnia d :
                DniTygodnia.values()) {
            System.out.println(d);
        }
    }
}
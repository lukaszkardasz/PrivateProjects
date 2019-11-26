package nauka.Podstawy.MethodsExercise;

public class Butelka {


    double ileLitrow;

    Butelka(double ileLitrow){
        this.ileLitrow=ileLitrow;
    }

    public double getIleLitrow() {
        return ileLitrow;
    }

    void wlej(double ilosc){
        this.ileLitrow+=ilosc;
    }

    void wilej(double ilosc){
        this.ileLitrow-=ilosc;
    }







    public static void main(String[] args) {
        Butelka[] butelki = new Butelka[51];

        for (int i = 0; i<51; i++){
            butelki[i] = new Butelka(i);
        }

        

        for (int i = 0; i<51; i++){
            System.out.println(butelki[i].getIleLitrow());
        }



    }
}

package nauka.exercise.CalcEnumTest;

public enum Computation {

    DODAWANIE {
        public double operacja(double x, double y){
            return x + y;
        }
    },
    ODEJMOWANIE {
        public double operacja(double x, double y){
            return x - y;
        }
    },
    MNOZENIE {
        public double operacja(double x, double y){
            return x * y;
        }
    },
    DZIELENIE {
        public double operacja(double x, double y){
            return x / y;
        }
    };

    public abstract double operacja (double x, double y);


    public static void main(String[] args) {
        System.out.println(Computation.DODAWANIE.operacja(4,5));
        System.out.println(Computation.ODEJMOWANIE.operacja(4,5));
        System.out.println(Computation.MNOZENIE.operacja(4,5));
        System.out.println(Computation.DZIELENIE.operacja(4,5));
    }
}

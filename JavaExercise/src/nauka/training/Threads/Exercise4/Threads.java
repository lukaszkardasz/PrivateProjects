package nauka.training.Threads.Exercise4;

class NowyWatek implements Runnable {

    private String name;
    Thread t;
    //konstruktor w ktorym tworzymy obiekt i startujemy nowy watek
    NowyWatek(String nazwa) {
        this.name = nazwa;
        t = new Thread(this, nazwa);
        t.start();
    }

    @Override
    public void run() {
        System.out.println("Uruchomiono watek potomny " + name);

        try {
            System.out.println("Watek potomny " + name + " uspiony");
            Thread.sleep(5000);
            System.out.println("Watek potomny " + name + " wznowiony");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Zakonczono dzialanie watku potomnego " + name);
    }
}

public class Threads {
    public static void main(String[] args) {
        NowyWatek nw1 = new NowyWatek ("JEDEN");
        NowyWatek nw2 = new NowyWatek ("DWA");
        NowyWatek nw3 = new NowyWatek ("TRZY");
        NowyWatek nw4 = new NowyWatek ("CZTERY");

        System.out.println("WĄTEK " + nw1.t.getName() + " " + nw1.t.isAlive());
        System.out.println("WĄTEK " + nw2.t.getName() + " " + nw2.t.isAlive());
        System.out.println("WĄTEK " + nw3.t.getName() + " " + nw3.t.isAlive());
        System.out.println("WĄTEK " + nw4.t.getName() + " " + nw4.t.isAlive());


        try{
            System.out.println("Usypiam watek glowny");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Przerwano watek główny");
        }
        System.out.println("Zakonczono wykonywanie watku glownego");

        System.out.println("WĄTEK " + nw1.t.getName() + " " + nw1.t.isAlive());
        System.out.println("WĄTEK " + nw2.t.getName() + " " + nw2.t.isAlive());
        System.out.println("WĄTEK " + nw3.t.getName() + " " + nw3.t.isAlive());
        System.out.println("WĄTEK " + nw4.t.getName() + " " + nw4.t.isAlive());


    }

}

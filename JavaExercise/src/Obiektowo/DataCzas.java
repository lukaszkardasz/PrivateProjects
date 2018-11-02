package Obiektowo;

import java.time.Clock;
import java.time.Instant;



class DataCzas{


    public static void main(String[] args) {

/*      long t1 = System.currentTimeMillis();
        for (int i=0;i<1E7;i++){
            double x = Math.pow(Math.random(), Math.random());
        }
        long t2 = System.currentTimeMillis();
        System.out.println((t2-t1)/1000.0 + " sek");*/

        //lub


        Clock clock = Clock.systemDefaultZone();
        long milis1 = clock.millis();
        for (int i=0;i<1E7;i++) {
            double x = Math.pow(Math.random(), Math.random());
        }
        long milis2 = clock.millis();
        System.out.println(milis2-milis1);

        Instant instant = clock.instant();
        System.out.println(instant);




    }
}

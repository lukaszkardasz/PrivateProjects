package Obiektowo;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Data {

    public static void main(String[] args) {

        System.out.printf("%tc%n", new Date()); //wstawianie aktualnej daty
        System.out.printf("%tc%n", new GregorianCalendar()); //wstawianie aktualnej daty

        GregorianCalendar dzis = new GregorianCalendar();
        int rok = dzis.get(Calendar.YEAR);
        System.out.println("Mamy rok" + rok);


    }
}

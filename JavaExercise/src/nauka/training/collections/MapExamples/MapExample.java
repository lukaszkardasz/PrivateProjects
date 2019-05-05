package nauka.training.collections.MapExamples;

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        TreeMap<Integer, Pracownik> mapa = new TreeMap();

        Pracownik[] pracownicy = {
                new Pracownik("Agnieszka"),
                new Pracownik("Ziuta"),
                new Pracownik("Franek"),
                new Pracownik("Gienek"),
                new Pracownik("Agnieszka"),
                new Pracownik("Ziuta"),
                new Pracownik("Franek"),
                new Pracownik("Gienek"),
                new Pracownik("Agnieszka"),
                new Pracownik("Ziuta"),
                new Pracownik("Franek"),
                new Pracownik("Gienek"),
                new Pracownik("Agnieszka"),
                new Pracownik("Ziuta"),
                new Pracownik("Franek"),
                new Pracownik("Gienek"),
        };

        for (Pracownik pracownik : pracownicy) {
            mapa.put(pracownik.getID(), pracownik);
        }

        //System.out.println(mapa);
        mapa.remove(4);

        mapa.put(4, new Pracownik("Mietek"));
        mapa.put(3, new Pracownik("Glut"));
        System.out.println(mapa);
        mapa.entrySet();

/*        mapa.forEach((key, value) -> {
            System.out.println("ID: " + key);
            System.out.println("Imię: " + value);
        });*/

        Map<Integer, Pracownik> subMapa = mapa.subMap(0, 3);
        if (subMapa.isEmpty()) {
            System.out.println("jest pusto");
        } else {
            subMapa.forEach((key, value) -> {
                System.out.println("ID: " + key);
                System.out.println("Imię: " + value);
            });
        }

/*


        //tworzymy nową mapę
        Map<Integer, String> map0 = new HashMap<>();
        map0.put(102, "Rudy");
        map0.put(103, "Wiesiek");
        map0.put(134, "Gruby");
        map0.put(119, "Wacek");
        //wyswietl cala mape map0
        System.out.println(map0);
        //wyswietl wartosc klucza 102
        System.out.println(map0.get(102));

        Map<Integer, String> map2 = new HashMap<>();
        map2.putAll(map0);
        map2.put(100, "Kurczak");
        System.out.println(map2);

        Map<KeyMapEntry,String> map1 = new HashMap<>();
        map1.put(new KeyMapEntry(1),"One");
        map1.put(new KeyMapEntry(2),"Two");
        map1.put(new KeyMapEntry(3),"Three");
        System.out.println(map1.size());

        Map<String, String> sampleMap = new HashMap<>();
        sampleMap.put("Marek", "Magda");
        sampleMap.put("Marcin", "Adela");

        System.out.println("Iterowanie po wartosciach");
        for(String value : sampleMap.values()) {
            System.out.println(value);
        }

        System.out.println("Iterowanie po kluczach i pobieranie wartosci");
        for(String key : sampleMap.keySet()) {
            String value = sampleMap.get(key);
            System.out.println(key + ": " + value);
        }

        System.out.println("Iterowanie po kluczach i wartosciach");
        for(Map.Entry<String, String> entry : sampleMap.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ": " + value);
        }*/

    }
}

class Pracownik {
    public Pracownik() {
        i++;
        ID = i;
    }

    public Pracownik(String imie) {
        this();
        this.imie = imie;
    }

    public int getID() {
        return ID;
    }

    public String getImie() {
        return imie;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "imie='" + imie + '\'' +
                ", ID=" + ID +
                '}';
    }

    String imie;
    private int ID;
    public static int i = 0;
}
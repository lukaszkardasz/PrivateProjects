package nauka.training.collections.MapExamples;

import java.util.HashMap;
import java.util.Map;

public class MapExample
{
    public static void main(String[] args) {
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
        }

    }
}

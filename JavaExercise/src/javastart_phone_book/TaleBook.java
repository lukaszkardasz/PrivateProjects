package javastart_phone_book;

import java.util.TreeMap;
import java.util.Map;

public class TaleBook {
    private Map<String, Contact> stringContactMap = new TreeMap<>();

    public TaleBook() {
    }

    public TaleBook(Map<String, Contact> contacts) {
        this.stringContactMap = contacts;
    }

    public boolean add(String name, String phoneNumber) {
        if (name == null || phoneNumber == null) {
            throw new NullPointerException("name and telephone cannot be null");
        }
        if (name.isEmpty() || phoneNumber.isEmpty()) {
            throw new IllegalArgumentException("name and telephone cannot be empty");
        }

    }
}



package javastart_phone_book;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.Map;

public class TaleBook {
    private Map<String, Contact> contacts = new TreeMap<>();

    public TaleBook() {
    }

    public TaleBook(Map<String, Contact> contacts) {
        this.contacts = contacts;
    }

    public boolean add(String name, String phoneNumber) {
        if (name == null || phoneNumber == null) {
            throw new NullPointerException("name and telephone cannot be null");
        }
        if (name.isEmpty() || phoneNumber.isEmpty()) {
            throw new IllegalArgumentException("name and telephone cannot be empty");
        }
        if (!contacts.containsKey(name)) {
            contacts.put(name, new Contact(name, phoneNumber));
            return true;
        }
        return false;
    }

    public boolean remove(String name) {
        return contacts.remove(name) != null;
    }

    public List<Contact> findByName(String name) {
        List<Contact> result = new ArrayList<>();
        for (var entry : contacts.entrySet()) {
            if (entry.getKey().contains(name)) {
                result.add(entry.getValue());
            }
        }
        return result;
    }

    public List<Contact> findByTelephone(String telephone) {
        List<Contact> result = new ArrayList<>();
        for (var contact : contacts.values()) {
            if (contact.getPhoneNumber().contains(telephone)) {
                result.add(contact);
            }
            return result;
        }
    }

}




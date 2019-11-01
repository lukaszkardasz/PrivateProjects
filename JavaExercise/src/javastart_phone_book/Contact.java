package javastart_phone_book;

import java.util.Objects;

public class Contact implements Comparable<Contact>{
    private String contactName;
    private String phoneNumber;

    public Contact(String contactName, String phoneNumber) {
        this.contactName = contactName;
        this.phoneNumber = phoneNumber;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return contactName + " : " + phoneNumber;
    }

    @Override
    public int compareTo(Contact c) {
        return this.contactName.compareTo(c.contactName);
    }
}

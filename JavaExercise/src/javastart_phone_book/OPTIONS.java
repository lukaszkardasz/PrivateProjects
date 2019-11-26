package javastart_phone_book;

import java.util.NoSuchElementException;

public enum OPTIONS {

    ADD_CONTACT(0, "Dodaj nowy kontakt"),
    SEARCH_BY_NAME(1, "Szukaj po nazwie"),
    SEARCH_BY_NUMBER(2, "Szukaj po numerze telefonu"),
    REMOVE_CONTACT(3, "Usuń kontakt"),
    EXIT(4, "Wyjście z programu");

    private final int shortcut;
    private final String description;

    OPTIONS(int shortcut, String description) {
        this.shortcut = shortcut;
        this.description = description;
    }

    public int getShortcut() {
        return shortcut;
    }

    @Override
    public String toString() {
        return shortcut + " - " + description;
    }

    public static OPTIONS convertToOption(int option){
        if(option < 0 || option >=OPTIONS.values().length){
            throw new NoSuchElementException();
        }
        return OPTIONS.values()[option];
    }
}

package javastart_phone_book;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

import static javastart_phone_book.FileUtils.FILE_NAME;

public class PhoneBookController {

    private PhoneBook phoneBook;
    private Scanner sc = new Scanner(System.in);

    public PhoneBookController() {

        File file = new File(FILE_NAME);
        boolean fileExists = file.exists();
        System.out.println("Plik utworzony: " + file.getAbsolutePath());
        if (!fileExists) {
            try {
                fileExists = file.createNewFile();
            } catch (IOException e) {
                System.out.println("Nie udało się utworzyć pliku");
            }
        }

        if (fileExists)
            System.out.println("Plik " + file + " już istnieje.");

        phoneBook = FileUtils.read();
    }

    public void loop(){
        OPTIONS option = null;
        while(option != OPTIONS.EXIT){
            showOptions();
            try {
                OPTIONS chooseOption = chooseOption();
                executeOption(chooseOption);
            } catch (NoSuchElementException e) {
                System.out.println("Nieprawidłowa opcja, spróbuj jeszcze raz!");
            }
        }
    }

    private void showOptions(){
        System.out.println(">>>>>> Opcje: ");
        for (OPTIONS option : OPTIONS.values()) {
            System.out.println(option);
        }
    }

    private OPTIONS chooseOption(){
        int option = sc.nextInt();
        sc.nextLine();
        return OPTIONS.convertToOption(option);
    }

    private void executeOption(OPTIONS options){
        switch(options){
            case ADD_CONTACT -> addContact();
            case SEARCH_BY_NAME -> searchByName();
            case SEARCH_BY_NUMBER -> searchByTelephone();
            case REMOVE_CONTACT -> delete();
            case EXIT -> close();
        }
    }

    private void delete() {
        System.out.println("Podaj nazwę rekordu do usunięcia: ");
        String nameToDelete = sc.nextLine();
        boolean remove = phoneBook.remove(nameToDelete);
        if (remove){
            System.out.println("Rekord usunięty pozytywnie!");
        } else{
            System.out.println("Nie ma rekordu o takiej nazwie");
        }
    }

    private void searchByName() {
        System.out.println("Podaj nazwę kontaktu lub jego fragment: ");
        String nameToFind = sc.nextLine();
        List<Contact> contacts = phoneBook.findByName(nameToFind);
        if(contacts.isEmpty()){
            System.out.println("Brak wyników!");
        } else {
            System.out.println("Znalezionych rekordów: " + contacts.size());
            contacts.forEach(System.out::println);
        }
    }

    private void searchByTelephone() {
        System.out.println("Podaj numer telefonu lub jego fragment: ");
        String phoneToFind = sc.nextLine();
        List<Contact> contacts = phoneBook.findByTelephone(phoneToFind);
        if(contacts.isEmpty()){
            System.out.println("Brak wyników!");
        } else {
            System.out.println("Znalezionych rekordów: " + contacts.size());
            contacts.forEach(System.out::println);
        }
    }

    private void addContact() {
        System.out.println("Podaj imię i nazwisko: ");
        String name = sc.nextLine();
        System.out.println("Podaj numer telefonu: ");
        String phone = sc.nextLine();
        try {
            boolean add = phoneBook.add(name, phone);
            if (add){
                System.out.println("Rekord dodany!");
            } else {
                System.out.println("Nie można dodać rekordu. Wpis o takiej nazwie już istnieje!");
            }
        } catch (IllegalArgumentException e) {
            System.err.println("Nazwa ani numer telefonu nie mogą być puste!");
        }
    }

    private void close() {
        try {
            FileUtils.save(phoneBook);
            System.out.println("Zapisano zmiany.");
        } catch (IOException e) {
            System.err.println("Nie udało się zapisać zmian!");
        }
        System.out.println("Bye bye!");
        //sc.close();
        System.exit(0);
    }
}

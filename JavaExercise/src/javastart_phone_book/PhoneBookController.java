package javastart_phone_book;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class PhoneBookController {

    private PhoneBook phoneBook = new PhoneBook();
    private Scanner sc = new Scanner(System.in);

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
        //TODO add delete method;
    }

    private void searchByTelephone() {
        //TODO add searchByTelephone method;
    }

    private void searchByName() {
        //TODO add searchByName method;
    }

    private void addContact() {
        //TODO add addContact method;
    }

    private void close() {
        sc.close();
        System.out.println("bye bye!");
        System.exit(0);
    }
}

package javastart_phone_book;

import java.util.Scanner;

public class PhoneBookController {

    private PhoneBook phoneBook = new PhoneBook();
    private Scanner sc = new Scanner(System.in);

    public void loop(){
        showOptions();
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

    private void executeOption(OPTIONS option){

    }

    private void delete() {

    }

    private void searchByTelephone() {

    }

    private void searchByName() {

    }

    private void addContact() {

    }

    private void close() {

    }


}

package javastart_phone_book;

public class PhoneBookApp {
    public static void main(String[] args) {
        PhoneBookController phoneBookController = new PhoneBookController();
        phoneBookController.loop();
    }
}

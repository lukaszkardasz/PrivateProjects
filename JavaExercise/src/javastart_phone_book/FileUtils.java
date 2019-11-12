package javastart_phone_book;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author n2god on 03/11/2019
 * @project PrivateProjects
 */
public class FileUtils {

    protected static final String FILE_NAME = "phoneBook.csv";

    public static void save(PhoneBook phoneBook) throws IOException {
        var writer = new BufferedWriter(new FileWriter(FILE_NAME));
        for (Contact contact : phoneBook){
            writer.write(contact.toCsv());
            writer.newLine();
        }
        writer.close();
    }

    public static PhoneBook read() {
        PhoneBook book = null;
        try {
            var buffReader = new BufferedReader(new FileReader(FILE_NAME));
            Map<String, Contact> contacts = buffReader.lines()
                    .map(line -> line.split(";"))
                    .map(split -> new Contact(split[0], split[1]))
                    .collect(Collectors.toMap(Contact::getContactName, Function.identity()));
            book = new PhoneBook(new TreeMap<>(contacts));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return book != null ? book : new PhoneBook();
    }
}

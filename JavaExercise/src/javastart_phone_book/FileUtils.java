package javastart_phone_book;

import java.io.*;

/**
 * @author n2god on 03/11/2019
 * @project PrivateProjects
 */
public class FileUtils {
    private static final String FILE_NAME = "phoneBook.csv";

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
            /*buffReader.lines()
                    .map()*/
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}

package nauka.training.Basics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author n2god on 09/05/2019
 * @project PrivateProjects
 * Liczymy wystapienia litery a w stringu składającym się z @Param n liczby liter podawanych w pierwszym wierszu
 * String dzielimy na powtarzalne części i resztę, liczymy wystąpienia a w powtarzalnych częściach i mnozymy przez liczbę wystąpień, potem dodajemy ressztę co @Param count
 */
public class RepeatedString {

    static long repeatedString(String s, long n) {
        char[] string = s.toCharArray();
        int slength = s.length();
        long repeatedPartOfString = n / slength;
        long rest = n % slength;
        long count = 0;
        for (int i = 0; i < slength; i++) {
            if (string[i] == 'a')
                count++;
        }
        count *= repeatedPartOfString;
        for (int i = 0; i < rest; i++) {
            if (string[i] == 'a')
                count++;
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        String s = scanner.nextLine();
        long n = scanner.nextLong();


        long result = repeatedString(s, n);
        scanner.close();
        System.out.println(result);
    }


}

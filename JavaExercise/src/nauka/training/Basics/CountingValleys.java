package nauka.training.Basics;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CountingValleys {

    static int valleys = 0; // number of valleys
    static int lvl = 0; //current lvl



    static int countingValleys(int n, String s) {
        for (char currentChar : s.toCharArray()){
            if (currentChar == 'U') ++lvl;
            if (currentChar == 'D') --lvl;

            if (lvl == 0 && currentChar == 'U'){
                ++valleys;
            }
        } return valleys;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);
        scanner.close();

        System.out.println(result);

    }


}


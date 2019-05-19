package nauka.training.Basics;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SockMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int socksNumber, int[] socksTable) {

        Arrays.sort(socksTable);

        int countPairs = 0;
        for (int i = 0; i < socksNumber - 1; i++) {
                if (socksTable[i] == socksTable[i+1]) {
                    countPairs++;
                    i++;
                }
            }

        return countPairs;
    }


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = scanner.nextInt();
        }

        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}

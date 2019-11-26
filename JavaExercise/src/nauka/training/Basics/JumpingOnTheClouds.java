package nauka.training.Basics;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;

/**
 * @author n2god on 08/05/2019
 * @project PrivateProjects
 */
public class JumpingOnTheClouds {


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int c[] = new int[n];

        for (int i = 0; i < n; i++) {
            c[i] = scanner.nextInt();
        }

        int result = jumpingOnClouds(c, n);
        System.out.println(result);
    }

    static int jumpingOnClouds(int[] c, int n) {
        int count = -1;
        for (int i = 0; i < n; i++, count++) {
            if (i < n - 2 && c[i + 2] == 0) i++;
        }
        return count;
    }
}

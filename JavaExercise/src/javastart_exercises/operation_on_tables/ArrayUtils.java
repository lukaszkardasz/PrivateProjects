package javastart_exercises.operation_on_tables;

import java.util.Arrays;

/**
 * @author n2god on 31/08/2019
 * @project PrivateProjects
 */
public class ArrayUtils {


    public static int[][] getBiggerArray(int[][] table1, int[][] table2) {
        int sum1 = sumMultiArray(table1);
        int sum2 = sumMultiArray(table2);
        return sum1 > sum2 ? table1:table2;
    }

    private static int sumMultiArray(int[][] table) {
        int sum = 0;
        for (int[] ints : table) {
            for (int number : ints) {
                sum += number;
            }
        }
        return sum;
    }

    public static String[] longerLenght(String[] table1, String[] table2){
        int chars1 = lenghtCheck(table1);
        int chars2 = lenghtCheck(table2);
        return chars1 > chars2 ? table1:table2;
    }

    private static int lenghtCheck(String[] table) {
        return Arrays.stream(table)
                .mapToInt(String::length)
                .sum();
    }
    public static int biggestNumberFromTable(int[] table){
        Arrays.sort(table);
        return table[table.length-1];
    }

    public static int lowestNumberFromTable(int[] table){
        Arrays.sort(table);
        return table[0];
    }

    static int[] maxRow(int[][] array) {
        int maxSum = Arrays.stream(array[0]).sum();
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            int[] row = array[i];
            int rowSum = Arrays.stream(array[i]).sum();
            if (rowSum > maxSum) {
                maxSum = rowSum;
                maxIndex = i;
            }
        }
        return array[maxIndex];
    }
}

package javastart_exercises.operation_on_tables;

import java.util.Arrays;

/**
 * @author n2god on 31/08/2019
 * @project PrivateProjects
 */
public class ArrayTest {
    public static void main(String[] args) {
        int[][] table1 = new int[][]{{1,2,3,4},{1,2,3,4},{4,3,2,1},{4,3,2,1}};
        int[][] table2 = new int[][]{{10,2,3,4},{5,2,3,4},{4,6,2,1},{4,3,62,1}};
        String[] stringTable1 = new String[]{"aa", "bb", "cc"};
        String[] stringTable2 = new String[]{"aaa", "bba", "ccc"};
        int []table = new int[]{5, 10, 15, 20, 25};

        //biggest table sum
        int[][] biggestTableSum = ArrayUtils.getBiggerArray(table1, table2);
        System.out.println("Większa tablica:");
        for (int[] ints : biggestTableSum) {
            for (int anInt : ints) {
                System.out.print(anInt + ", ");
            }
        }
        System.out.println();

        //longest String table
        String[] longestStringTable = ArrayUtils.longerLenght(stringTable1, stringTable2);
        System.out.println("Tablica z większą ilością znaków:");
        for (String s : longestStringTable) {
            System.out.print(s + ", ");
        }

        //biggest number from int table

        int max = ArrayUtils.biggestNumberFromTable(table);
        int min = ArrayUtils.lowestNumberFromTable(table);
        System.out.println("\nTable: " + "min: " + min + ", max: " + max);

        //biggest sum in row in multidimensional array ex: [1, 2, 3], [7, 8, 9], [3, 4, 5]], return [7, 8, 9].
        int[] ints = ArrayUtils.maxRow(table1);
        System.out.println("Wiersz z największą sumą liczb: " + Arrays.toString(ints));
    }
}

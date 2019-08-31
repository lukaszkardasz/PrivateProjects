package javastart_exercises.operation_on_tables;

/**
 * @author n2god on 31/08/2019
 * @project PrivateProjects
 */
public class TableOperations {


    public static int[][] biggerSum(int[][] table1, int[][] table2) {
        if (sumTableInt(table1) > sumTableInt(table2)) return table1;
        else if (sumTableInt(table1) < sumTableInt(table2)) return table2;
        return new int[][]{};
    }

    private static int sumTableInt(int[][] table) {
        int sumTable1 = 0;
        for (int i = 0; i < table[0].length; i++) {
            sumTable1 += table[0][i] + table[table.length - 1][i];
        }
        for (int j = 0; j < table.length - 1; j++) {
            sumTable1 += table[j][0] + table[j][table[0].length - 1];
        }
        return sumTable1;
    }

    public static String[] longerLenght(String[] table1, String[] table2){
        if (lenghtCheck(table1) > (lenghtCheck(table2))) return table1;
        else if (lenghtCheck(table1) < (lenghtCheck(table2))) return table2;
        return new String[]{};
    }

    private static int lenghtCheck(String[] table1) {
        int table1Lenght = 0;
        for (int i = 0; i < table1.length; i++) {
            table1Lenght +=table1[i].length();
        }
        return table1Lenght;
    }
}

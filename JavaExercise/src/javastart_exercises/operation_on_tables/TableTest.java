package javastart_exercises.operation_on_tables;

/**
 * @author n2god on 31/08/2019
 * @project PrivateProjects
 */
public class TableTest {
    public static void main(String[] args) {
        int[][] table1 = new int[][]{{1,2,3,4},{1,2,3,4},{4,3,2,1},{4,3,2,1}};
        int[][] table2 = new int[][]{{10,2,3,4},{5,2,3,4},{4,6,2,1},{4,3,62,1}};
        String[] stringTable1 = new String[]{"aa", "bb", "cc"};
        String[] stringTable2 = new String[]{"aaa", "bba", "ccc"};


        //biggest table sum
        int[][] biggestTableSum = TableOperations.biggerSum(table1, table2);
        for (int[] ints : biggestTableSum) {
            for (int anInt : ints) {
                System.out.print(anInt + ", ");
            }
        }
        System.out.println();

        //longest String table
        String[] longestStringTable = TableOperations.longerLenght(stringTable1, stringTable2);
        for (String s : longestStringTable) {
            System.out.print(s + ", ");
        }
    }
}
